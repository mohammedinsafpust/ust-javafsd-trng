create database ustDB;
show databases;
use ustDB;
create table ust_tables(ID int not null primary key,name varchar(28),
state varchar(20),
age int);
show tables;
desc ust_tables;
insert into ust_tables values(1,"insaf","kerala",23),
(2,"insaf","kerala",23),
(3,"insaf","kerala",23);
select * from ust_tables;


update ust_tables set age =25 where id =2;
select name, if(ID>2,"good","bad")as remarks from ust_tables;

create table table2(ID int not null primary key,dpt_name varchar(10),city varchar(34));
alter table table2 change column dpt_name dept_name varchar(15);
insert into table2 values (1,"physics","kozhikode"),
(2,"cs","kannur"),
(3,"it","ekm"),
(4,"ce","mlp"),
(5,"ec","ktm");

select name,dept_name,city,state from ust_tables join table2 on ust_tables.ID=table2.ID;
select count(ID)from ust_tables;
select city,count(*) from table2 group by city;
select count(*) from table2;

select * from tables2 order by city ;