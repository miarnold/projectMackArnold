package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

/**
 * The type Routes.
 */
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

    /**
     * Instantiates a new Routes.
     */
    public Routes() {

    }

    /**
     * Instantiates a new Routes.
     *
     * @param routeId              the route id
     * @param driverName           the driver name
     * @param numberOfMiles        the number of miles
     * @param numberOfHighwayMiles the number of highway miles
     * @param numberOfCityMiles    the number of city miles
     * @param whichCar             the which car
     * @param dateOfTrip           the date of trip
     * @param gasPrice             the gas price
     * @param commuteNotes         the commute notes
     * @param userName             the user name
     * @param total                the total
     * @param mpgCity              the mpg city
     * @param mpgHigh              the mpg high
     */
    public Routes(int routeId, String driverName,int numberOfMiles, int numberOfHighwayMiles,
                  int numberOfCityMiles, String whichCar, String dateOfTrip, double gasPrice,
                  String commuteNotes, String userName, String total, String mpgCity, String mpgHigh) {

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
        this.mpgCity = mpgCity;
        this.mpgHigh = mpgHigh;

    }

    /**
     * Gets route id.
     *
     * @return the route id
     */
    public int getRouteId() {
        return routeId;
    }

    /**
     * Sets route id.
     *
     * @param routeId the route id
     */
    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    /**
     * Gets driver name.
     *
     * @return the driver name
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Sets driver name.
     *
     * @param driveName the drive name
     */
    public void setDriverName(String driveName) {
        this.driverName = driveName;
    }

    /**
     * Gets number of miles.
     *
     * @return the number of miles
     */
    public int getNumberOfMiles() {
        return numberOfMiles;
    }

    /**
     * Sets number of miles.
     *
     * @param numberOfMiles the number of miles
     */
    public void setNumberOfMiles(int numberOfMiles) {
        this.numberOfMiles = numberOfMiles;
    }

    /**
     * Gets number of highway miles.
     *
     * @return the number of highway miles
     */
    public int getNumberOfHighwayMiles() {
        return numberOfHighwayMiles;
    }

    /**
     * Sets number of highway miles.
     *
     * @param numberOfHighwayMiles the number of highway miles
     */
    public void setNumberOfHighwayMiles(int numberOfHighwayMiles) {
        this.numberOfHighwayMiles = numberOfHighwayMiles;
    }

    /**
     * Gets number of city miles.
     *
     * @return the number of city miles
     */
    public int getNumberOfCityMiles() {
        return numberOfCityMiles;
    }

    /**
     * Sets number of city miles.
     *
     * @param numberOfCityMiles the number of city miles
     */
    public void setNumberOfCityMiles(int numberOfCityMiles) {
        this.numberOfCityMiles = numberOfCityMiles;
    }

    /**
     * Gets which car.
     *
     * @return the which car
     */
    public String getWhichCar() {
        return whichCar;
    }

    /**
     * Sets which car.
     *
     * @param whichCar the which car
     */
    public void setWhichCar(String whichCar) {
        this.whichCar = whichCar;
    }

    /**
     * Gets date of trip.
     *
     * @return the date of trip
     */
    public String getDateOfTrip() {
        return dateOfTrip;
    }

    /**
     * Sets date of trip.
     *
     * @param dateOfTrip the date of trip
     */
    public void setDateOfTrip(String dateOfTrip) {
        this.dateOfTrip = dateOfTrip;
    }

    /**
     * Gets gas price.
     *
     * @return the gas price
     */
    public double getGasPrice() {
        return gasPrice;
    }

    /**
     * Sets gas price.
     *
     * @param gasPrice the gas price
     */
    public void setGasPrice(double gasPrice) {
        this.gasPrice = gasPrice;
    }

    /**
     * Gets commute notes.
     *
     * @return the commute notes
     */
    public String getCommuteNotes() {
        return commuteNotes;
    }

    /**
     * Sets commute notes.
     *
     * @param commuteNotes the commute notes
     */
    public void setCommuteNotes(String commuteNotes) {
        this.commuteNotes = commuteNotes;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    @ManyToOne()
    @JoinColumn(name="user_id", nullable = false)
    public String getUsername() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets total.
     *
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets total.
     *
     * @param total the total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * Gets mpg city.
     *
     * @return the mpg city
     */
    public String getMpgCity() {
        return mpgCity;
    }

    /**
     * Sets mpg city.
     *
     * @param mpgCity the mpg city
     */
    public void setMpgCity(String mpgCity) {
        this.mpgCity = mpgCity;
    }

    /**
     * Gets mpg high.
     *
     * @return the mpg high
     */
    public String getMpgHigh() {
        return mpgHigh;
    }

    /**
     * Sets mpg high.
     *
     * @param mpgHigh the mpg high
     */
    public void setMpgHigh(String mpgHigh) {
        this.mpgHigh = mpgHigh;
    }


}
