/*
create table 테이블명(
	속성명 타입 .. ,
    속성명 타입 ..
);

create table 테이블명(select 테이블에 추가할 속성들 from 기존테이블명);
*/
create table if not exists course_min(
	select num, subject_code, student_num from course
);