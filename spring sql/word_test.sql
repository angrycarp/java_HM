drop database if exists wordgame;
create database wordgame;
use wordgame;
drop table if exists `word`;
create table Word (
	wo_num int not null primary key auto_increment,
	wo_en varchar(30) not null,
    wo_select1 varchar(30) not null,
    wo_select2 varchar(30) not null,
    wo_select3 varchar(30) not null,
    wo_answer_num int not null
);

insert into `word`(wo_en, wo_select1, wo_select2, wo_select3, wo_answer_num) values('apple', '사과', '독약', 'PPAP', '1');
insert into `word`(wo_en, wo_select1, wo_select2, wo_select3, wo_answer_num) values('dog', '고양이', '개', '술마신사람', '2');
insert into `word`(wo_en, wo_select1, wo_select2, wo_select3, wo_answer_num) values('moning', '수면', '밥', '아침', '3');
insert into `word`(wo_en, wo_select1, wo_select2, wo_select3, wo_answer_num) values('familiar', '친숙한', '백만개의파', '오답1', '1');
insert into `word`(wo_en, wo_select1, wo_select2, wo_select3, wo_answer_num) values('independent', '방어적인' ,'독립적인', '더미데이터', '2');
insert into `word`(wo_en, wo_select1, wo_select2, wo_select3, wo_answer_num) values('burden', '부르뎅', '답아님', '부담', '3');
insert into `word`(wo_en, wo_select1, wo_select2, wo_select3, wo_answer_num) values('inventive', '창의적인', '오답404', '선택하지마세요', '1');
insert into `word`(wo_en, wo_select1, wo_select2, wo_select3, wo_answer_num) values('endeavor', '엔데믹', '노력하는', '우리조', '2');
insert into `word`(wo_en, wo_select1, wo_select2, wo_select3, wo_answer_num) values('tenacity', '코딩할때', '필요한', '끈기', '3');
