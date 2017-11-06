

DROP TABLE IF EXISTS `cars`;
CREATE TABLE `cars` (
  `carID` int(11) NOT NULL,
  `city_miles` int(11) NOT NULL,
  `driving_wheels` varchar(255) DEFAULT NULL,
  `fuel_type` varchar(255) NOT NULL,
  `highway_miles` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `vehicle_category` varchar(255) DEFAULT NULL,
  `vehicle_size` varchar(255) DEFAULT NULL,
  `vehicle_type` varchar(255) NOT NULL,
  `VIN` int(11) DEFAULT NULL,
  `year_of_make` int(11) DEFAULT NULL,
  PRIMARY KEY (`carID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


LOCK TABLES `cars` WRITE;

UNLOCK TABLES;

DROP TABLE IF EXISTS `routes`;
CREATE TABLE `routes` (
  `route_id` int(11) NOT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `date` tinyblob,
  `Driver_name` varchar(255) DEFAULT NULL,
  `gas_price` double DEFAULT NULL,
  `number_of_city_miles` int(11) DEFAULT NULL,
  `number_of_high_way_miles` int(11) DEFAULT NULL,
  `number_of_miles` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `which_car` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`route_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


LOCK TABLES `routes` WRITE;

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

INSERT INTO `users` VALUES (1,'admin','admin','Mack','Arnold','miarnold@madisoncollege.edu'),(2,'mack','arnold','Mack','Arnold','arnold@gmail.com'),(3,'sam','soper','Sam','Soper','ugly@gmail.com'),(4,'aaron','football','aaron','briggs','google@gmail.com');
UNLOCK TABLES;

