-- 도서 상태를 샘플데이터를 추가
INSERT INTO BOOK_STATE(BS_DESC) VALUES('예약가능'),('예약중'),
('예약 불가능'),('대출 중'),('대충 가능'),('대출 불가능');

-- 도서 샘플 데이터를 추가
-- 101.1ABC12 자바의 정석 남궁성 도우출판 일반도서(대출/예약이 가능한 도서)
-- 103.987DD Do it! 점프 투 파이썬 박응용 이지스퍼블리싱, 예약 불가능한 도서
-- 500.ABC123 해리포터와 마법사의 돌 1 J.K. 롤링 저자/ 강동역 엮은이 문학수첩, 일반도서
INSERT INTO BOOK(BO_NUM, BO_TYPE, BO_TITLE, BO_PUBLISHER, BO_AUTHOR, BO_POSSIBLE_LOAN, BO_POSSIBLE_RESERVATION)
VALUES('101.1ABC12', '개발', '자바의 정석', '도우출판', '저자 : 남궁성', 4, 1),
('103.987DD', '코딩', 'Do it! 점프 투 파이썬', '이지스퍼블리싱', '저자 : 박응용', 4, 3),
('500.ABC123', '외국 소설', '해리포터와 마법사의 돌 1', '문학수첩', '저자 : J.K. 롤링/엮은이 강동혁', 4, 1);

-- 회원 샘플 데이터를 추가
INSERT INTO MEMBER(ME_ID, ME_PW, ME_PHONE, ME_BIRTHDAY, ME_AUTHORITY)
	VALUES('ADMIN', 'ADMIN', '011-1234-5678', '2000-01-01', 'ADMIN'),
    ('QWE123', 'QWE123', '010-1111-2222', '2002-02-02', 'USER');
    
-- QWE123 회원이 자바의 정석을 예약했을때 적용해야하는 쿼리
INSERT INTO RESERVATION(RE_RESERVATION_DATE, RE_ME_ID, RE_BO_NUM)
	SELECT date_format(NOW(),'%Y-%m-%d'), 'QWE123', BO_NUM FROM BOOK WHERE BO_TITLE = '자바의 정석';
UPDATE BOOK 
SET 
    BO_POSSIBLE_RESERVATION = (SELECT 
            BS_NUM
        FROM
            BOOK_STATE
        WHERE
            BS_DESC = '예약 중')
WHERE
    BO_NUM = '101.1ABC12';
    
    
-- 예약 가능한 도서를 조회하는 쿼리
SELECT 
    *
FROM
    BOOK
WHERE
    BO_POSSIBLE_RESERVATION = (SELECT 
            BS_NUM
        FROM
            BOOK_STATE
        WHERE
            BS_DESC = '예약 가능');
-- 대출 가능한 도서를 조회하는 쿼리
SELECT 
    *
FROM
    BOOK
WHERE
    BO_POSSIBLE_LOAN = (SELECT 
            BS_NUM
        FROM
            BOOK_STATE
        WHERE
            BS_DESC = '대출 가능')
	AND
    BO_POSSIBLE_RESERVATION = (SELECT 
            BS_NUM
        FROM
            BOOK_STATE
        WHERE
            BS_DESC != '예약 중');
            
-- QWE123 회원이 대출 가능한 도서를 조회하는 쿼리
SELECT 
    *
FROM
    BOOK
		LEFT JOIN
	RESERVATION ON RE_BO_NUM = BO_NUM
WHERE
    BO_POSSIBLE_LOAN = (SELECT 
            BS_NUM
        FROM
            BOOK_STATE
        WHERE
            BS_DESC = '대출 가능')
	AND 
    (RE_NUM IS NULL OR RE_ME_ID = 'QWE123');
    
-- QWE123회원이 예약한 자바의 정석을 대출했을 때 적용해야 하는 쿼리
INSERT INTO LOAN(LO_DATE, LO_ME_ID, LO_BO_NUM, LO_EXPECTED_DATE)
	VALUES (date_format(NOW(),'%Y-%m-%d'), 'QWE123', '101.1ABC12', date_format( date_add(NOW(), INTERVAL 14 DAY), '%Y-%m-%d'));

DELETE FROM RESERVATION
WHERE
	RE_ME_ID = 'QWE123'
    AND RE_BO_NUM = (SELECT
		BO_NUM
	FROM
		BOOK
	WHERE
		BO_TITLE = '자바의 정석');
        
-- 도서 상태를 수정
UPDATE BOOK 
SET 
    BO_POSSIBLE_RESERVATION = (SELECT 
            BS_NUM
        FROM
            BOOK_STATE
        WHERE
            BS_DESC = '예약 가능'),
	BO_POSSIBLE_LOAN = (SELECT 
            BS_NUM
        FROM
            BOOK_STATE
        WHERE
            BS_DESC = '대출 중')
WHERE
    BO_NUM = '101.1ABC12';
    
-- 회원이 대출한 도서 수를 증가
UPDATE MEMBER
SET
	ME_BOOK_COUNT = ME_BOOK_COUNT + 1
WHERE
	ME_ID = 'QWE123';
    
-- QWE123회원이 현재 대출한 도서를 조회하는 쿼리
SELECT
	*
FROM
	BOOK
		JOIN
	LOAN ON LO_BO_NUM = BO_NUM
WHERE
	LO_ME_ID = 'QWE123' AND LO_RETURN_DATE IS NULL;
    
-- QWE123회원이 자바의 정석을 반납했을 때 필요한 쿼리
-- 대출 테이블에 반납일을 수정
UPDATE LOAN
SET
	LO_RETURN_DATE = date_format(NOW(),'%Y-%m-%d')
WHERE
	LO_BO_NUM = '101.1ABC12';

-- 도서 테이블에 해당 도서의 도서 상태를 수정
UPDATE BOOK 
SET 
	BO_POSSIBLE_LOAN = (SELECT 
            BS_NUM
        FROM
            BOOK_STATE
        WHERE
            BS_DESC = '대출 가능')
WHERE
    BO_NUM = '101.1ABC12';
-- 회원이 대출한 도서 수를 감소
UPDATE MEMBER
SET
	ME_BOOK_COUNT = ME_BOOK_COUNT - 1
WHERE
	ME_ID = 'QWE123';
    
-- 연체일을 계산해서 회원 테이블을 수정
UPDATE MEMBER
SET
	ME_TOTAL_OVERDUE = ME_TOTAL_OBERDUE + 연체일
WHERE
	ME_ID = 'QWE123';

SELECT LOAN.*,
	CASE
		WHEN DATEDIFF(LO_RETURN_DATE, LO_EXPECTED_DATE) < 1 THEN
			0
		ELSE DATEDIFF(LO_RETURN_DATE, LO_EXPECTED_DATE)
	END AS 연체일
FROM LOAN
WHERE
	LO_ME_ID = 'QWE123' AND LO_BO_NUM = '101.1ABC12';
    
-- 회원이 대출한 모든 도서가 반납됬을 때 연체일이 있으면 다음날부터 연체 적용이 되도록 수정
UPDATE MEMBER 
SET 
    ME_APPLY_OVERDUE = (SELECT 
			CASE
                    WHEN
                        ME_BOOK_COUNT = 0
                            AND ME_TOTAL_OVERDUE != 0
                    THEN
                        DATE_FORMAT(DATE_ADD(NOW(),
                                    INTERVAL ME_TOTAL_OVERDUE DAY),
                                '%Y-%m-%d')
                    ELSE NULL
                END AS T
        FROM
            (SELECT * FROM MEMBER) AS TMP
        WHERE
            ME_ID = 'QWE123')
WHERE
    ME_ID = 'QWE123' AND LO_RETURN_DATE IS NULL;

-- 각 회원들의 대출이 불가능한 기간을 조회하는 쿼리.
-- 대출이 가능한 회원들은 대출 가능으로 표시하고,
-- 대출이 불가능한 회원은 언제까지인지를 표시하도록 작성

SELECT 
	ME_ID AS '아이디',
    CASE 
		WHEN ME_APPLY_OVERDUE IS NULL THEN '대출 가능' 
		ELSE ME_APPLY_OVERDUE END AS '대출 가능 여부'
FROM MEMBER;

-- 각 도서별 대출 회수를 조회하는 쿼리
SELECT 
	BO_TITLE AS '도서명',
    COUNT(LO_NUM) AS '대출 회수'
FROM BOOK
LEFT JOIN LOAN ON LO_BO_NUM = BO_NUM
GROUP BY BO_NUM;

-- 회원별 연체 횟수를 조회하는 쿼리
SELECT 
	ME_ID AS '아이디',
    COUNT(LO_EXPECTED_DATE < LO_RETURN_DATE) AS 연체회수
FROM 
	MEMBER
		LEFT JOIN 
	LOAN ON ME_ID = LO_ME_ID
GROUP BY ME_ID;


-- 도서를 가장 많이 대여한 회원을 조회하는 쿼리, 대출수가 같은 경우 아이디순으로 정렬 후 첫번째 회원을 선택
SELECT 
	LO_ME_ID AS 아이디,
    COUNT(LO_NUM) AS 대출도서수
	FROM MEMBER
		LEFT JOIN
	LOAN ON LO_ME_ID = ME_ID
		GROUP BY LO_ME_ID
		ORDER BY 대출도서수 DESC
        LIMIT 1;



-- 대출 테이블에 데이터 추가가 됐을 때 실행 해야 되어야 하는 쿼리를 트리거를 이용하여 작성한 후 적용 
USE BOOK;
DROP TRIGGER IF EXISTS INSERT_LOAN;

DELIMITER //
CREATE TRIGGER INSERT_LOAN BEFORE INSERT ON LOAN
FOR EACH ROW
BEGIN
	
	-- NEW.LO_ME_ID 회원이 도서 NEW.LO_BO_NUM을 예약했으면  
	IF (
		SELECT 
			COUNT(*) 
		FROM 
			RESERVATION 
		WHERE 
			RE_ME_ID = NEW.LO_ME_ID AND 
            RE_BO_NUM = NEW.LO_BO_NUM
		) > 0 
	THEN
		-- 예약 테이블에 데이터를 삭제
        DELETE FROM RESERVATION 
		WHERE
			RE_ME_ID = NEW.LO_ME_ID
			AND RE_BO_NUM = NEW.LO_BO_NUM;
		
        -- 도서의 예약 상태를 예약 가능으로 수정
        UPDATE BOOK
		SET
			BO_POSSIBLE_RESERVATION = (
				SELECT 
					BS_NUM 
				FROM 
					BOOK_STATE 
				WHERE 
					BS_DESC = '예약 가능'
			)
		WHERE
			BO_NUM = NEW.LO_BO_NUM;
    END IF;
    
    -- 도서 대출 상태를 대출 중으로 수정 
    UPDATE BOOK
	SET
		BO_POSSIBLE_LOAN = (
			SELECT 
				BS_NUM 
            FROM 
				BOOK_STATE 
            WHERE 
				BS_DESC = '대출 중'
		)
	WHERE
		BO_NUM = NEW.LO_BO_NUM;
        
	-- 회원이 대출한 도서 수를 증가 
    UPDATE 
		MEMBER
	SET
		ME_BOOK_COUNT = ME_BOOK_COUNT + 1
	WHERE
		ME_ID = NEW.LO_ME_ID;
END //
DELIMITER ;


INSERT INTO LOAN(LO_DATE, LO_ME_ID, LO_BO_NUM, LO_EXPECTED_DATE)
VALUES(DATE_FORMAT(NOW(),'%Y-%m-%d'), 'QWE123', '500.ABC123 V1 1', 
		DATE_FORMAT( DATE_ADD( NOW(), INTERVAL 14 DAY),'%Y-%m-%d'));
    
INSERT INTO LOAN(LO_DATE, LO_ME_ID, LO_BO_NUM, LO_EXPECTED_DATE)
VALUES(DATE_FORMAT(NOW(),'%Y-%m-%d'), 'ADMIN', '103.987DD', 
		DATE_FORMAT( DATE_ADD( NOW(), INTERVAL 14 DAY),'%Y-%m-%d'));


