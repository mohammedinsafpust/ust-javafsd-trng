use ustDB;
CREATE  TABLE Employee1(EMP_ID int not null primary key,
MANAGER_ID int null,
FIRST_NAME varchar(50) not null,
LAST_NAME varchar(50) not null,
EMP_TITLE varchar(50) not null,
SALARY varchar(50) not null,
JOINING_DATE varchar(50) not null,
DEP varchar(50) not null);
show tables;
insert into Employee1 values(1,NULL,"Monika","Arora","Manager",1000000,'02/20/14 9:00',"HR"),
(2,1,"Niharika","Verma","Execute",8000,'06/11/14 9:00',"Admin"),
(3,1,"Vishal","Singhal","Execute",300000,'02/20/14 9:00',"HR"),
(4,NULL,"Amitabh","Singh","Manager",50000,'02/20/14 9:00',"Admin"),
(5,4,"Vivek","Bhati","Asst.Manager",500000,'06/11/14 9:00',"Admin"),
(6,5,"Vipul","Diwan","Executive",200000,'06/11/14 9:00',"Account"),
(7,4,"Satish","Kumar","Lead",75000,'01/20/14 9:00',"Account"),
(8,4,"Geetika","Chauhan","Lead",90000,'04/11/14 9:00',"Admin");
select FIRST_NAME,LAST_NAME from Employee1 where salary>50000 and salary<100000;
select e.FIRST_NAME as EMPLOYEE_NAME,m.FIRST_NAME as MANAGER_NAME from Employee1 e join Employee1 m on (e.MANAGER_ID=m.EMP_ID);
select DEP,count(EMP_ID) as No_of_employees from Employee1 group by DEP order by No_of_employees desc;
select FIRST_NAME,LAST_NAME from Employee1 where MANAGER_ID is NULL;
select count(*) from Employee1 where JOINING_DATE>'01/01/14 0:00' and JOINING_DATE<'31/12/14 0:00'; 

