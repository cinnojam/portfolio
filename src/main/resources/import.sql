INSERT INTO issuer (issuer, ticker, name) VALUES ('90520E', 'UNBC', 'MUFG UNION BANK NA');
INSERT INTO security (cusip, issuer, issue, desc, issue_date, maturity_date) VALUES ('90520EAF8', '90520E', 'AF', 'UNION BANK NA', '2014-05-06', '2019-05-06');
INSERT INTO price (id, cusip, date, price) VALUES (2, '90520EAF8', '2017-03-31', 1.0058);
INSERT INTO price (id, cusip, date, price) VALUES (3, '90520EAF8', '2017-06-30', 1.00442);
INSERT INTO price (id, cusip, date, price) VALUES (4, '90520EAF8', '2017-09-30', 1.00328);
INSERT INTO price (id, cusip, date, price) VALUES (5, '90520EAF8', '2017-12-31', 0.99882);
INSERT INTO price (id, cusip, date, price) VALUES (6, '90520EAF8', '2018-03-31', 0.99293);
