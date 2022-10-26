create table board(
	idx int not null auto_increment,
	title varchar(200) not null,
	content varchar(2000) not null,
	writer varchar(20) not null,
	indate datetime default now(),
	count int default 0,
	primary key(idx)
);

insert into board(title, content, writer)
values('스프링 MVC','스프링 MVC','홍길동');

insert into board(title, content, writer)
values('스프링 BOOT','스프링 BOOT','이수환');

insert into board(title, content, writer)
values('스프링 Security','스프링 Security','홍동');

select * from board;
drop table board;