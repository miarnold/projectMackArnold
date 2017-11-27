-- MySQL dump 10.13  Distrib 5.7.19, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: mackproject
-- ------------------------------------------------------
-- Server version	5.7.19-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cars`
--

DROP TABLE IF EXISTS `cars`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cars`
--

LOCK TABLES `cars` WRITE;
/*!40000 ALTER TABLE `cars` DISABLE KEYS */;
INSERT INTO `cars` VALUES (2,22,'Gas',28,'mack','small SUV',1717171,2013,'Jeep Cpmass'),(4,800,'none',1000,'sam','Bike',14141,2011,'Trek Wingra'),(6,25,'Gas',30,'mack','Full Car',14141,2009,'Chevy Impala'),(8,26,'Gas',32,'mack','SUV',56565595,2016,'Toyota Rav4'),(10,30,'gas',35,'mack','Car',68499,2017,'Toyota Camry'),(13,19,'Gas',24,'mack','SUV',65485475,2001,'Ford Explorer'),(15,100000,'Deseil',10000,'mack','BIKE',595911,2009,'Trek Wingras');
/*!40000 ALTER TABLE `cars` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `routes`
--

DROP TABLE IF EXISTS `routes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `routes`
--

LOCK TABLES `routes` WRITE;
/*!40000 ALTER TABLE `routes` DISABLE KEYS */;
INSERT INTO `routes` VALUES (1,'this was a great ride','11-22-2017','Mack',2.45,23,45,68,'mack','compass','$100',NULL,NULL),(3,'it was a great trip','11-25-2017','mack',2.46,23,45,0,'mack','compass','68',NULL,NULL),(5,'let see if this works','11-45-2017','mack',2.45,65,45,110,'mack','compass','269.5',NULL,NULL),(7,'i dont know','11-25-2017','mack',2.46,48,56,104,'mack','compass',NULL,'24','30'),(9,'im hoping for full money back','11-01-2017','mack',2.94,23,45,68,'mack','impala','158.76','24','30'),(13,'this car sucks','11-78-2017','niko',2.23,20,20,40,'mack','BMW x54','6.813888888888889','9','24');
/*!40000 ALTER TABLE `routes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_roles` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(15) NOT NULL,
  `role_name` varchar(15) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (1,'admin','administrator'),(2,'mack','administrator'),(3,'sam','registered-user'),(5,'aaron','registered-user'),(7,'niko-lie','registered-user'),(9,'aaron','registered-user'),(11,'aaron','registered-user'),(13,'aaron','registered-user');
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(15) NOT NULL,
  `user_pass` varchar(15) NOT NULL,
  `first_name` varchar(25) DEFAULT NULL,
  `last_name` varchar(25) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','Mack','Arnold','miarnold@madisoncollege.edu'),(2,'mack','arnold','Mack','Arnold','arnold@gmail.com');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-27 15:27:10
