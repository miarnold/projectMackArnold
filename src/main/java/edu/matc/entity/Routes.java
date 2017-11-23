package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "routes")
public class Routes {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "route_id")
    private int routeId;
    @Column(name = "Driver_name")
    private String driverName;
    @Column(name = "number_of_miles")
    private int numberOfMiles;
    @Column(name = "number_of_high_way_miles")
    private int numberOfHighwayMiles;
    @Column(name = "number_of_city_miles")
    private int numberOfCityMiles;
    @Column(name = "which_car")
    private String whichCar;
    @Column(name = "date")
    private String dateOfTrip;
    @Column(name = "gas_price")
    private double gasPrice;
    @Column(name = "notes")
    private String commuteNotes;
    @Column (name="user_name")
    private String userName;
    @Column (name="total")
    private String total;
    @Column(name="MPGCity")
    private String mpgCity;
    @Column(name="MPGHigh")
    private String mpgHigh;

    public Routes() {

    }

    public Routes(int routeId, String driverName,int numberOfMiles, int numberOfHighwayMiles,
                  int numberOfCityMiles, String whichCar, String dateOfTrip, double gasPrice,
                  String commuteNotes, String userName, String total) {

        this.routeId = routeId;
        this.driverName = driverName;
        this.numberOfMiles = numberOfMiles;
        this.numberOfHighwayMiles = numberOfHighwayMiles;
        this.numberOfCityMiles = numberOfCityMiles;
        this.whichCar = whichCar;
        this.dateOfTrip = dateOfTrip;
        this.gasPrice = gasPrice;
        this.commuteNotes = commuteNotes;
        this.userName = userName;
        this.total = total;

    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driveName) {
        this.driverName = driveName;
    }

    public int getNumberOfMiles() {
        return numberOfMiles;
    }

    public void setNumberOfMiles(int numberOfMiles) {
        this.numberOfMiles = numberOfMiles;
    }

    public int getNumberOfHighwayMiles() {
        return numberOfHighwayMiles;
    }

    public void setNumberOfHighwayMiles(int numberOfHighwayMiles) {
        this.numberOfHighwayMiles = numberOfHighwayMiles;
    }

    public int getNumberOfCityMiles() {
        return numberOfCityMiles;
    }

    public void setNumberOfCityMiles(int numberOfCityMiles) {
        this.numberOfCityMiles = numberOfCityMiles;
    }

    public String getWhichCar() {
        return whichCar;
    }

    public void setWhichCar(String whichCar) {
        this.whichCar = whichCar;
    }

    public String getDateOfTrip() {
        return dateOfTrip;
    }

    public void setDateOfTrip(String dateOfTrip) {
        this.dateOfTrip = dateOfTrip;
    }

    public double getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(double gasPrice) {
        this.gasPrice = gasPrice;
    }

    public String getCommuteNotes() {
        return commuteNotes;
    }

    public void setCommuteNotes(String commuteNotes) {
        this.commuteNotes = commuteNotes;
    }

    @ManyToOne()
    @JoinColumn(name="user_id", nullable = false)
    public String getUsername() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getMpgCity() {
        return mpgCity;
    }

    public void setMpgCity(String mpgCity) {
        this.mpgCity = mpgCity;
    }

    public String getMpgHigh() {
        return mpgHigh;
    }

    public void setMpgHigh(String mpgHigh) {
        this.mpgHigh = mpgHigh;
    }


}
