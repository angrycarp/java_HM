USE SHOPPINGMALL;

-- 회원아이디가 ABC123, 비번이 1234, 번호가 011-1234-5678, 이름 홍길동
-- 주소가 서울시 강남구 KH빌딩, 주소 상세가 6층 361반, 우편번호가 01234인 회원이 가입을 했을 때 쿼리 작성
-- 권한은 ADMIN, USER 중 하나

insert into member(ME_ID, ME_PW, ME_PHONE, ME_ADDR, ME_ADDR_DETAIL, ME_POST, ME_AUTHORITY, Me_NAME)
	values('ABC123', '1234', '011-1234-5678', '서울시 강남구 KH빌딩', '6층 361반','01234', 'USER', '홍길동');

insert into member(ME_ID, ME_PW, ME_PHONE, ME_ADDR, ME_ADDR_DETAIL, ME_POST, ME_AUTHORITY, Me_NAME)
	values('admin', '1234', '011-1111-1111', '서울시 강남구 KH빌딩', '3층 101반','01231', 'ADMIN', '임꺽정');
insert into member(ME_ID, ME_PW, ME_PHONE, ME_ADDR, ME_ADDR_DETAIL, ME_POST, ME_AUTHORITY, Me_NAME)
	values('QWE123', 'QWE1234', '011-9999-5678', '서울시 강남구 KH빌딩', '1층 161반','01234', 'USER', '이하니');

-- 제품코드가 ABC001, 제품명이 KH무선마우스, 제품설명이 KH무선마우스입니다., 가격이 15000원,
-- 종류가 무선 / 유선인 제품을 등록하는 쿼리
-- PRODUCT 테이블과 OPTION테이블에 데이터를 추가
INSERT INTO PRODUCT VALUES('ABC001', 'KH무선마우스', 'KH무선마우스 입니다', '15000');
INSERT INTO `OPTION`(OP_NAME, OP_PR_CODE) VALUES('무선', 'ABC001'),('유선', 'ABC001');

-- 제품 코드가 ABC001인 제품의 제품 정보와 옵션을 조회하는 쿼리
SELECT * FROM PRODUCT
	JOIN `OPTION` ON PR_CODE = OP_PR_CODE
    WHERE PR_CODE = 'ABC001';