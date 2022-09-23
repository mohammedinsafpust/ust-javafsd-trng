use ustDB;
create table customer(EMP_ID int not null,
CUST_NAME varchar(50) not null,
CITY varchar(50) not null,
GRADE int not null,
SALESMAN_ID int NOT null);
insert into customer values(3001,"Nick Rimando","new york",100,5001),
(3002,"Brad Davis","New york",200,5001),
(3003,"Graham Zusi","California",200,5002),
(3004,"Julian Green","London",300,5002),
(3005,"Fabian John","Paris",300,5006),
(3006,"Geoff Rock","Berlin",100,5003),
(3007,"RazyAltidoe","Moscow",200,5007),
(3008,"Brad Gulan","london",300,5005);