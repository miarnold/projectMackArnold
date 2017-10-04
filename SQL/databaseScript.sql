CREATE DATABASE mackproject;


CREATE TABLE routes
(
  route_id                 INT AUTO_INCREMENT
    PRIMARY KEY,
  Driver_name              VARCHAR(30)  NOT NULL,
  number_of_miles          INT          NOT NULL,
  number_of_high_way_miles INT          NULL,
  number_of_city_miles     INT          NULL,
  which_car                VARCHAR(20)  NOT NULL,
  date                     DATE         NOT NULL,
  gas_price                VARCHAR(10)  NOT NULL,
  notes                    VARCHAR(100) NULL
);

CREATE TABLE user_roles
(
  user_name VARCHAR(15) NOT NULL,
  role_name VARCHAR(15) NOT NULL,
  PRIMARY KEY (user_name, role_name)
);

CREATE TABLE cars
(
  carID            INT AUTO_INCREMENT
    PRIMARY KEY,
  vehicle_type     VARCHAR(15) NOT NULL,
  vehicle_category VARCHAR(30) NULL,
  vehicle_size     VARCHAR(15) NULL,
  fuel_type        VARCHAR(30) NOT NULL,
  driving_wheels   VARCHAR(30) NULL,
  highway_miles    INT         NOT NULL,
  city_miles       INT         NOT NULL,
  year_of_make     INT         NULL,
  user_name        VARCHAR(15) NULL,
  CONSTRAINT cars_ibfk_1
  FOREIGN KEY (user_name) REFERENCES users (user_name)
);
CREATE INDEX user_name
  ON cars (user_name);

CREATE TABLE users
(
  user_name VARCHAR(15) NOT NULL
    PRIMARY KEY,
  user_pass VARCHAR(15) NOT NULL,
  route_id  INT         NULL,
  FOREIGN KEY (route_id) REFERENCES routes (route_id)
);
CREATE INDEX route_id
  ON users (route_id);