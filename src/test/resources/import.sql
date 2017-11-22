
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;


LOCK TABLES `cars` WRITE;

INSERT INTO `cars` VALUES (2,22,'Gas',28,'mack','small SUV',1717171,2013,'Jeep Cpmass'),(4,800,'none',1000,'sam','Bike',14141,2011,'Trek Wingra');

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
  PRIMARY KEY (`route_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;


LOCK TABLES `routes` WRITE;

INSERT INTO `routes` VALUES (1,'this was a great ride','11-22-2017','Mack',2.45,23,45,68,'mack','compass','$100');

UNLOCK TABLES;


DROP TABLE IF EXISTS `user_roles`;

CREATE TABLE `user_roles` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(15) NOT NULL,
  `role_name` varchar(15) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;


LOCK TABLES `user_roles` WRITE;

INSERT INTO `user_roles` VALUES (1,'admin','administrator'),(2,'mack','administrator'),(3,'sam','registered-user');

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

LOCK TABLES `users` WRITE;

INSERT INTO `users` VALUES (1,'admin','admin','Mack','Arnold','miarnold@madisoncollege.edu'),(2,'mack','arnold','Mack','Arnold','arnold@gmail.com'),(3,'sam','soper','Sam','Soper','ugly@gmail.com'),(7,'aaron','football','aaron','briggs','google@gmail.com');

UNLOCK TABLES;

