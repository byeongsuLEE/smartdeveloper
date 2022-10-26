drop table member cascade constraint;
create table member (
id varchar(200) not null,
pw varchar(200) not null,
name varchar(200) not null,
age number(10)
);
select * from member;