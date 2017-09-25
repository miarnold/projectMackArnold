package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "routes")
public class Routes {

    @Id
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
    private LocalDate dateOfTrip;
    @Column(name = "gas_price")
    private double gasPrice;
    @Column(name = "notes")
    private String commuteNotes;

    public Routes() {

    }

    public Routes(int routeId, String driverName,int numberOfMiles, int numberOfHighwayMiles,
                  int numberOfCityMiles, String whichCar, LocalDate dateOfTrip, double gasPrice,
                  String commuteNotes) {

        this.routeId = routeId;
        this.driverName = driverName;
        this.numberOfMiles = numberOfMiles;
        this.numberOfHighwayMiles = numberOfHighwayMiles;
        this.numberOfCityMiles = numberOfCityMiles;
        this.whichCar = whichCar;
        this.dateOfTrip = dateOfTrip;
        this.gasPrice = gasPrice;
        this.commuteNotes = commuteNotes;

    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getDriveName() {
        return driverName;
    }

    public void setDriveName(String driveName) {
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

    public LocalDate getDateOfTrip() {
        return dateOfTrip;
    }

    public void setDateOfTrip(LocalDate dateOfTrip) {
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


}
