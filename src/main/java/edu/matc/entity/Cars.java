package edu.matc.entity;


import com.sun.javafx.beans.IDProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Cars {
    @Id
    @Column(name = "carID")
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private int car_id;
    @Column(name = "vehicle_type", nullable = false)
    private String vehicleType;
    @Column(name = "fuel_type", nullable = false)
    private String fuelType;
    @Column(name = "highway_miles", nullable = false)
    private int highwayMiles;
    @Column(name = "city_miles", nullable = false)
    private int cityMiles;
    @Column(name = "year_of_make")
    private int yearOfMake;
    @Column(name = "VIN")
    private int vin;
    @Column(name="user_id")
    private int userId;
    @Column(name="car_name")
    private String carName;


    public Cars() {

    }



    public Cars (int car_id, String vehicleType, String fuelType, int highwayMiles, int cityMiles,
                 int yearOfMake, int vin, int userId, String carName) {
        this.car_id = car_id;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.highwayMiles = highwayMiles;
        this.cityMiles = cityMiles;
        this.yearOfMake = yearOfMake;
        this.vin = vin;
        this.userId = userId;
        this.carName = carName;

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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
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

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int vin) {
        this.userId = userId;
    }


}
