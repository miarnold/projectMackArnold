package edu.matc.entity;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Cars {

    private int car_id;
    private String vehicleType;
    private String vehicleCategory;
    private String vehicleSize;
    private String fuelType;
    private String drivingWheels;
    private int highwayMiles;
    private int cityMiles;
    private int yearOfMake;
    private int vin;


    public Cars() {

    }

    public Cars (int car_id, String vehicleType, String vehicleCategory, String vehicleSize,
                 String fuelType, String drivingWheels, int highwayMiles, int cityMiles,
                 int yearOfMake, int vin) {

        this.car_id = car_id;
        this.vehicleType = vehicleType;
        this.vehicleCategory = vehicleCategory;
        this.vehicleSize = vehicleSize;
        this.fuelType = fuelType;
        this.drivingWheels = drivingWheels;
        this.highwayMiles = highwayMiles;
        this.cityMiles = cityMiles;
        this.yearOfMake = yearOfMake;
        this.vin = vin;

    }



    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleSize(String vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getDrivingWheels() {
        return drivingWheels;
    }

    public void setDrivingWheels(String drivingWheels) {
        this.drivingWheels = drivingWheels;
    }

    public int getHighwayMiles() {
        return highwayMiles;
    }

    public void setHighwayMiles(int highwayMiles) {
        this.highwayMiles = highwayMiles;
    }

    public int getCityMiles() {
        return cityMiles;
    }

    public void setCityMiles(int cityMiles) {
        this.cityMiles = cityMiles;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

}
