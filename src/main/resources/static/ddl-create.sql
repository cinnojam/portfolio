CREATE DATABASE `portfolio` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

CREATE TABLE `issuer` (
  `issuer` char(6) COLLATE utf8_bin NOT NULL,
  `ticker` varchar(100) COLLATE utf8_bin NOT NULL,
  `name` varchar(256) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`issuer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `security` (
  `cusip` char(9) COLLATE utf8_bin NOT NULL,
  `issuer` char(6) COLLATE utf8_bin NOT NULL,
  `issue` char(2) COLLATE utf8_bin NOT NULL,
  `issue_date` date NOT NULL,
  `maturity_date` date NOT NULL,
  `desc` varchar(256) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`cusip`),
  UNIQUE KEY `issuer_issue_UNIQUE` (`issuer`,`issue`) /*!80000 INVISIBLE */
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `price` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cusip` varchar(9) COLLATE utf8_bin NOT NULL,
  `date` date NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cusip_date_UNIQUE` (`cusip`,`date`) /*!80000 INVISIBLE */
) ENGINE=InnoDB AUTO_INCREMENT=7725 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `portfolio` (
  `cusip` char(6) COLLATE utf8_bin NOT NULL,
  `par` double DEFAULT NULL,
  PRIMARY KEY (`cusip`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
