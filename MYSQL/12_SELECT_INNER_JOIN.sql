/*
join 문법
-- 테이블1의 외래키가 테이블2의 기본키를 참조하는 경우
-- join은 일반적으로 외래키와 기본키를 연결하지만, 상황에 따라서는 외래키가 아닌 속성을 기본키와 연결할 수 있다.
select
	테이블1.속성명1, 테이블1.속성명2, ..., 테이블2.속성명1, 테이블2.속성명2,....
from
	테이블1
inner join | left join | right join -- inner 조인과 outer 조인 둘다 가능
	테이블2
on
	테이블1.외래키 = 테이블2.기본키
[inner join | left join | right join
	테이블3
on
	테이블1.외래키 = 테이블3.기본키]
[where 절]
[group by절]
[having 절]
[order by절]
[limit절]
*/
SELECT 
    course.*, title
FROM
    course
join
	subject
on
	course.subject_code = code;
    
-- 대학물리를 수강하는 학생들 수를 조회하는 쿼리
SELECT 
    subject_code as '과목코드', count(*) as '수강생수'
FROM
    course
WHERE
    subject_code IN (SELECT 
            code
        FROM
            subject
        WHERE
            title = '대학물리')
group by subject_code;
SELECT 
    subject_code as '과목코드', count(*) as '수강생수'
FROM
    course
join
	subject
on
	subject_code = code
WHERE
	title = '대학물리'
group by subject_code;

-- 유재석 학생이 수강하는 과목의 수를 조회하는 쿼리
SELECT 
    student_num as 유재석학번, count(*) as 수강과목수
FROM
    course
WHERE
    student_num = (SELECT 
            num
        FROM
            student
        WHERE
            name = '유재석')
group by student_num;
select
	student_num as 유재석학번, count(*) as 수강과목수
from
	course
join
	student
on 
	student_num = student.num
where
	name = '유재석'
group by student_num;

-- 유재석 학생이 수강하는 과목명을 조회하는 쿼리
select
	name as 이름, title as 수강과목
from
	course
join
	student
on 
	student_num = student.num
join
	subject
on
	subject_code = code
where
	name = '유재석';
    
-- 이순신 교수님이 강의하는 과목명을 조회하는 쿼리

select distinct
	professor_name as 교수명, title as 수강과목
from
	course
join
	subject
on 
	subject_code = code
where
	professor_name = '이순신';

