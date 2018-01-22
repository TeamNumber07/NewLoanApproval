show databases;
create database loanapproval;
use  loanapproval;

show tables;


create table adminlogin
(
	adminname varchar(10),
    adminpass varchar(20)
);


desc adminlogin;

drop table adminlogin;

create table userlogin
(
	userid int(4) auto_increment,
	firstname varchar(20),
	lastname varchar(20),
	username varchar(20),
	userpass varchar(16),
	emailid varchar(50),
    primary key(userid)
);

desc userlogin;

drop table userlogin;


create table personal_details
(
	reg_id int(4) auto_increment,
	userid int(4) not null,
    fname varchar(20),
    mname varchar(20),
    lname varchar(20),
    gender varchar(6),
    dob date,
    address varchar(50),
    city varchar(20),
    pincode int(6),
    state varchar(25),
    emailid varchar(50),
    mobileno varchar(13),
    primary key(reg_id),
    foreign key(userid) references userlogin(userid)
);

desc personal_details;

drop table user_registration;

alter table personal_details 
auto_increment=1000;



create table financial_details
(
	financial_id int(4) auto_increment,
    userid int(4) not null,
    nature_of_occupation varchar(15),
    employer_name varchar(40),
    total_experience int(2),
    designation varchar(12),
    yearly_income double(10,2),
    pan_no varchar(10) unique,
    primary key(financial_id),
    foreign key(userid) references userlogin(userid)
);

drop table financial_details;

desc financial_details;

select * from financial_details;

create table assets
(
	assets_id int(4) auto_increment,
	userid int(4) not null,
    own_house varchar(3),
    house_cost float(9,2),
    vehicle_type int(2),
    vehicle_cost float(9,2),
    vehicle_puchase_date date,
    fd varchar(3),
    fd_cost float(9,2),
    primary key(user_assets_id),
	foreign key(userid) references userlogin(userid)
);

desc assets;

select * from assets;

drop table assets;

create table expenditure_details
(
	expenditure_id int(4) auto_increment,
    userid int(4) not null,
    previous_loan varchar(3),
    previous_loan_amount double(9,2),
    loan_duration int(2),
    remaining_time_period int(2),
    emi double(9,2),
    pending_amount double(9,2),
    yearly_expenditure double(9,2),
    primary key(expenditure_id),
    foreign key(userid) references userlogin(userid)
);

drop table expenditure_details;

desc expenditure_details;

select * from expenditure_details;