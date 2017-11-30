

DROP TABLE IF EXISTS `cars`;

CREATE TABLE `cars` (
  `carID` int(11) NOT NULL AUTO_INCREMENT,
  `city_miles` int(11) NOT NULL,
  `fuel_type` varchar(255) NOT NULL,
  `highway_miles` int(11) NOT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `vehicle_type` varchar(255) NOT NULL,
  `VIN` int(11) DEFAULT NULL,
  `year_of_make` int(11) DEFAULT NULL,
  `car_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`carID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;


LOCK TABLES `cars` WRITE;

INSERT INTO `cars` VALUES (2,22,'Gas',28,'mack','small SUV',1717171,2013,'Jeep Cpmass'),(4,800,'none',1000,'sam','Bike',14141,2011,'Trek Wingra'),(6,25,'Gas',30,'mack','Full Car',14141,2009,'Chevy Impala'),(8,26,'Gas',32,'mack','SUV',56565595,2016,'Toyota Rav4'),(10,30,'gas',35,'mack','Car',68499,2017,'Toyota Camry'),(13,19,'Gas',24,'mack','SUV',65485475,2001,'Ford Explorer'),(15,100000,'Deseil',10000,'mack','BIKE',595911,2009,'Trek Wingras'),(17,30,'gas',25,'logan','dope',3,2019,'tesla');

UNLOCK TABLES;


DROP TABLE IF EXISTS `routes`;

CREATE TABLE `routes` (
  `route_id` int(11) NOT NULL AUTO_INCREMENT,
  `notes` varchar(255) DEFAULT NULL,
  `date` varchar(255) NOT NULL,
  `Driver_name` varchar(255) DEFAULT NULL,
  `gas_price` double DEFAULT NULL,
  `number_of_city_miles` int(11) DEFAULT NULL,
  `number_of_high_way_miles` int(11) DEFAULT NULL,
  `number_of_miles` int(11) DEFAULT NULL,
  `user_name` varchar(50) NOT NULL,
  `which_car` varchar(255) DEFAULT NULL,
  `total` varchar(255) DEFAULT NULL,
  `MPGCity` varchar(255) DEFAULT NULL,
  `MPGHigh` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`route_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;


LOCK TABLES `routes` WRITE;

INSERT INTO `routes` VALUES (1,'this was a great ride','11-22-2017','Mack',2.45,23,45,68,'mack','compass','$100',NULL,NULL),(3,'it was a great trip','11-25-2017','mack',2.46,23,45,0,'mack','compass','68',NULL,NULL),(5,'let see if this works','11-45-2017','mack',2.45,65,45,110,'mack','compass','269.5',NULL,NULL),(7,'i dont know','11-25-2017','mack',2.46,48,56,104,'mack','compass',NULL,'24','30'),(9,'im hoping for full money back','11-01-2017','mack',2.94,23,45,68,'mack','impala','158.76','24','30'),(21,'this is a test','11-29-2017','poop',3.36,50,50,100,'mack','compass','12.32','25','30'),(23,'another test','2017-29-11','google',2.31,50,50,100,'mack','compass','8.47','25','30'),(25,'test','11-59-2017','booger',2,1000,1000,2000,'mack','google car','200.0','20','20');

UNLOCK TABLES;



DROP TABLE IF EXISTS `user_roles`;

CREATE TABLE `user_roles` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(15) NOT NULL,
  `role_name` varchar(15) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;


LOCK TABLES `user_roles` WRITE;

INSERT INTO `user_roles` VALUES (1,'admin','administrator'),(2,'mack','administrator'),(3,'sam','registered-user'),(5,'aaron','registered-user'),(7,'niko-lie','registered-user'),(9,'aaron','registered-user'),(11,'aaron','registered-user'),(13,'aaron','registered-user'),(15,'logan','registered-user');

UNLOCK TABLES;

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(15) NOT NULL,
  `user_pass` varchar(15) NOT NULL,
  `first_name` varchar(25) DEFAULT NULL,
  `last_name` varchar(25) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

LOCK TABLES `users` WRITE;

INSERT INTO `users` VALUES (1,'admin','admin','Mack','Arnold','miarnold@madisoncollege.edu'),(2,'mack','arnold','Mack','Arnold','arnold@gmail.com');

UNLOCK TABLES;

