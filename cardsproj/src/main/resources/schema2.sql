create table Cust_Cards
(
  cardid char(20),
  custid char(6),
  issuedate date,
  expirydate date,
  nameoncard varchar(10),
  maxcashlimit int,
  maxcreditlimit int,
  outstanding int,
  lastpayment int,
  cvv int,
  mobile char(10)
)