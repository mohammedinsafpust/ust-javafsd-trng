use ustDB;
show tables;
desc Employee1;
desc ust_tables;
create view tb_view as select name,state from ust_tables;
select * from tb_view;
select * from ust_tables;

create index i_name on ust_tables(name);
show indexes from ust_tables;

