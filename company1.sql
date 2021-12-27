create database company2;
USE company2;
create table employee2(id int primary key auto_increment,first_name varchar(255),last_name varchar(255),username varchar(255),password varchar(255),address varchar(255),contact varchar(255));

insert into employee2 values(1,"Bachu","Ravali","Bachu Ravali","Ravali@1499","Hyderabad","7989044229");
select * from employee2;