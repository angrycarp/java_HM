-- qwe123회원이 구매한 제품명과 옵션명 목록을 확인하는 쿼리

select 
	or_me_id as 주문아이디,
    pr_name as 제품명,
    op_name as 옵션명,
    pr_price as 제품가격,
    ol_amount as 구매수량
from `order`
    join order_list on ol_or_num = or_num
    join `option` on ol_op_num = op_num
    join product on op_pr_code = pr_code
where or_state not in('환불', '반품') and or_me_id = 'qwe123';

-- adc123회원이 장바구니에 담은 제품명과 옵션명, 수량을 확인하는 쿼리

select 
	ba_me_id as 아이디,
    pr_name as 제품명,
    op_name as 옵션명,
    ba_amount as 수량
from `basket`
	join `option` on ba_op_num = op_num
    join product on op_pr_code = pr_code
where ba_me_id = 'abc123';

-- abc123 회원이 등록한 배송지 정보를 조회하는 쿼리

select *
from address
where ad_me_id = 'abc123';

-- 등록된 모든 제품을 검색하는 쿼리
select *
from product
join `option` on pr_code = op_pr_code;

-- kh가 제품명에 포함된 제품들을 검색하는 쿼리
select *
from product
where pr_name like '%kh%';

-- kh가 제품명에 포함된 제품들 중에서 1페이지에 해당하는 제품들을 검색하는 쿼리(한 페이지에는 제품이 최대 5개)
select *
from product
where pr_name like '%kh%' limit 0, 5;

-- abc123회원이 작성한 모든 리뷰를 조회하는 쿼리
select *
from review
where re_me_id = 'abc123';

-- abc123회원이 작성한 리뷰가 있는 제품명을 조회하는 쿼리
select 
	re_me_id as 회원명,
    pr_name as 제품이름
from review
join `option` on re_op_num = op_num
join product on op_pr_code = pr_code
where re_me_id = 'abc123';

-- 제품 코드가 abc001이고, 옵션명이 무선이 제품에 달린 리뷰를 조회
select *
from review
join `option` on re_op_num = op_num
where op_pr_code = 'abc001' and op_name = '무선';

-- 제품명이 kh무선마우스인 제품의 리뷰 개수를 조회하는 쿼리
select 
    count(*) as 'kh무선마우스 리뷰수'
from review
join `option` on re_op_num = op_num
where 
	op_pr_code = (select pr_code from product where pr_name = 'kh무선마우스');
    
-- 제품별 리뷰 개수를 조회하는 쿼리
select 
op_pr_code as '제품 코드',
count(re_num) as '리뷰 수'
from review
right join `option` on re_op_num = op_num
group by op_pr_code;

-- 제품별 옵션의 개수를 조회하는 쿼리
select *
from product
left join `option` on pr_code = op_pr_code
group by pr_name;

