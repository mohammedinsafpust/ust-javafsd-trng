create database org;
show databases;
use org;
create table Worker(WORKER_ID int not null,
FIRST_NAME varchar(50) not null,
LAST_NAME varchar(50) not null,
SALARY int not null,
JOINING_DATE VARCHAR(50) not null,
DEPARTMENT varchar(50));
insert into Worker values(001,"Monika","Arora",100000,"2014-02-20 09:00:00","HR"),
(002,"Niharika","Verma",80000,"2014-02-20 09:00:00","Admin"),
(003,"Vishal","Singhal",300000,"2014-02-20 09:00:00","HR"),
(004,"Amitabh","Singh",500000,"2014-02-20 09:00:00","Admin"),
(005,"Vivek","Bhati",500000,"2014-06-20 09:00:00","Admin"),
(006,"Vipul","Diwan",200000,"2014-06-11 09:00:00","Account"),
(007,"Satish","kumar",75000,"2014-01-20 09:00:00","Account"),
(008,"Geetika","Chauhan",90000,"2014-04-11 09:00:00","Admin");
select * from Worker;
create table Bonus(WORKER_ID int not null,
BONUS_DATE varchar(50) not null,
BONUS_AMOUNT int not null);
insert into Bonus values(1,"2016-02-20 00:00:00",5000),
(2,"2016-06-11 00:00:00",3000),
(3,"2016-02-20 00:00:00",4000),
(1,"2016-02-20 00:00:00",4500),
(2,"2016-06-11 00:00:00",3500);
CREATE table Title(WORKER_REF_ID int not null,
WORKERS_TITLE varchar(50) not null,
AFFECTED_FROM varchar(50) not null);
insert into Title values(1,"Manager","2016-02-20 00:00:00"),
(2,"Executive","2016-06-11 00:00:00"),
(8,"Executive","2016-06-11 00:00:00"),
(5,"Manager","2016-06-11 00:00:00"),
(4,"Asst.Manager","2016-06-11 00:00:00"),
(7,"Executive","2016-06-11 00:00:00"),
(6,"Lead","2016-06-11 00:00:00"),
(3,"Lead","2016-06-11 00:00:00");
select FIRST_NAME as WORKERS_NAME from Worker;
select upper(FIRST_NAME) from Worker;
select distinct(DEPARTMENT) from Worker;
select substring(FIRST_NAME,1,3) from Worker;
select instr(FIRST_NAME,"a") from Worker where FIRST_NAME="Amitabh";
select rtrim(FIRST_NAME) from Worker;
select ltrim(FIRST_NAME) from Worker;
