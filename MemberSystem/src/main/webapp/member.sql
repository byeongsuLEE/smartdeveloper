drop table member;

create table member(
id varchar2(500) primary key,
pw varchar2(500) not null,
nick varchar2(500) not null,
addr varchar2(500) not null


)

insert into member values('admin','1234','������','���ֱ�����');
select * from member;