package residence;

import constants.Constants;

/**
 * This class is an abstract main.java.residence.Residence class which implements comparable to sort the residences for later searches
 *
 * @author Shilo Gilor
 */
public abstract class Residence implements Comparable<Residence>{
    private String cityName;
    private String streetName;
    private int houseNumber;
//    price abstract

    /**
     *
     * @param cityName name of the city
     * @param streetName name of street
     * @param houseNumber house number within the street
     */
    public Residence(String cityName, String streetName, int houseNumber) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    /**
     * getter for city name
     * @return the city name
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * getter for the street name
     * @return the street name
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * getter for house number
     * @return the house number
     */
    public int getHouseNumber() {
        return houseNumber;
    }

    /**
     * getter for the base price
     * @return the base price
     */
    public double getBasePrice() { return Constants.basePrice; }

    /**
     * the abstract function to calculate the price of the main.java.residence
     * @return the price value of the main.java.residence
     */
    abstract public double getResidencePrice();

    /**
     * compares the residences in order to sort them by price
     * @param residence the object to be compared.
     * @return int to sort
     */
    public int compareTo(Residence residence) {
        if(this.getResidencePrice() > residence.getResidencePrice()){
            return 1;
        }else if(this.getResidencePrice() < residence.getResidencePrice()){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "main.java.residence.Residence{" +
                "cityName='" + cityName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                ", finalPrice=" + getResidencePrice() +
                '}';
    }
}
