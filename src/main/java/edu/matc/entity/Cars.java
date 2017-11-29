package edu.matc.entity;


import com.sun.javafx.beans.IDProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Cars.
 */
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
    @Column(name="user_name")
    private String userName;
    @Column(name="car_name")
    private String carName;


    /**
     * Instantiates a new Cars.
     */
    public Cars() {

    }


    /**
     * Instantiates a new Cars.
     *
     * @param car_id       the car id
     * @param vehicleType  the vehicle type
     * @param fuelType     the fuel type
     * @param highwayMiles the highway miles
     * @param cityMiles    the city miles
     * @param yearOfMake   the year of make
     * @param vin          the vin
     * @param userName     the user name
     * @param carName      the car name
     */
    public Cars (int car_id, String vehicleType, String fuelType, int highwayMiles, int cityMiles,
                 int yearOfMake, int vin, String userName, String carName) {
        this.car_id = car_id;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.highwayMiles = highwayMiles;
        this.cityMiles = cityMiles;
        this.yearOfMake = yearOfMake;
        this.vin = vin;
        this.userName = userName;
        this.carName = carName;

    }


    /**
     * Gets car id.
     *
     * @return the car id
     */
    public int getCar_id() {
        return car_id;
    }

    /**
     * Sets car id.
     *
     * @param car_id the car id
     */
    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    /**
     * Gets vehicle type.
     *
     * @return the vehicle type
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets vehicle type.
     *
     * @param vehicleType the vehicle type
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * Gets fuel type.
     *
     * @return the fuel type
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Sets fuel type.
     *
     * @param fuelType the fuel type
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * Gets highway miles.
     *
     * @return the highway miles
     */
    public int getHighwayMiles() {
        return highwayMiles;
    }

    /**
     * Sets highway miles.
     *
     * @param highwayMiles the highway miles
     */
    public void setHighwayMiles(int highwayMiles) {
        this.highwayMiles = highwayMiles;
    }

    /**
     * Gets city miles.
     *
     * @return the city miles
     */
    public int getCityMiles() {
        return cityMiles;
    }

    /**
     * Sets city miles.
     *
     * @param cityMiles the city miles
     */
    public void setCityMiles(int cityMiles) {
        this.cityMiles = cityMiles;
    }

    /**
     * Gets year of make.
     *
     * @return the year of make
     */
    public int getYearOfMake() {
        return yearOfMake;
    }

    /**
     * Sets year of make.
     *
     * @param yearOfMake the year of make
     */
    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    /**
     * Gets vin.
     *
     * @return the vin
     */
    public int getVin() {
        return vin;
    }

    /**
     * Sets vin.
     *
     * @param vin the vin
     */
    public void setVin(int vin) {
        this.vin = vin;
    }

    /**
     * Gets car name.
     *
     * @return the car name
     */
    public String getCarName() {
        return carName;
    }

    /**
     * Sets car name.
     *
     * @param carName the car name
     */
    public void setCarName(String carName) {
        this.carName = carName;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets username.
     *
     * @param userName the user name
     */
    public void setUsername(String userName) {
        this.userName = userName;
    }


}
