create table Cards
(  
  cardsid char(10),
  cardname varchar(20),
  annualfee char(5),
  eligibility varchar(40),
  cardtype varchar(10)
);

create table Cust_Cards
(
  cardid char(20),
  custid char(6),
  issuedate char(10),
  expirydate char(10),
  nameoncard varchar(10),
  maxcashlimit int,
  maxcreditlimit int,
  outstanding int,
  lastpayment int,
  cvv int,
  mobile char(10)
)

