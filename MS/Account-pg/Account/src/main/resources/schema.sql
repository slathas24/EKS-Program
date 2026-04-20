drop table if exists  bank_account; 
create table bank_account 
( accountid  char(4),
  custid  char(4),
  accounttype  varchar(10),
  balance integer,
 currency char(3)
);
