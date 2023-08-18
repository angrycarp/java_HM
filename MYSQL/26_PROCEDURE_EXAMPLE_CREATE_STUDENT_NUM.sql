-- 입학년도, 학과코드, 순서가 주어졌을 때 학번을 생성해서 SELECT로 출력하는 프로시저를 작성 

DROP PROCEDURE IF EXISTS CREATE_STUDENT_NUM;

DELIMITER //
CREATE PROCEDURE CREATE_STUDENT_NUM(
IN _YEAR INT,
IN _DEP_CODE CHAR(3),
IN _ORDER_NUM INT
)
BEGIN
	DECLARE _ORDER_CHAR CHAR(3); -- 순서에 0을 채운 문자열 
    DECLARE _STUDENT_NUM CHAR(10); -- 최종 학번
    
    SET _ORDER_CHAR = (SELECT LPAD(_ORDER_NUM, 3, '0'));
    
    SET _STUDENT_NUM = CONCAT(_YEAR, _DEP_CODE, _ORDER_CHAR);
    SELECT _STUDENT_NUM;
END //
DELIMITER ;
-- 2023135004
CALL CREATE_STUDENT_NUM(2023, "135", 4);