package edu.matc.entity;

import java.time.LocalDate;

public class Routes {

    private int routeId;
    private String driverName;
    private int numberOfMiles;
    private int numberOfHighwayMiles;
    private int numberOfCityMiles;
    private String whichCar;
    private LocalDate dateOfTrip;
    private double gasPrice;
    private String commuteNotes;

    public Routes() {

    }

    public Routes(int routeId, String driverName,int numberOfMiles, int numberOfHighwayMiles,
                  int numberOfCityMiles, String whichCar, LocalDate dateOfTrip, double gasPrice,
                  String commuteNotes) {

        this.routeId = routeId;
        this.driverName = driverName;

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
