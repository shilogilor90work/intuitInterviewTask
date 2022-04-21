package residence.privateHomes;

import constants.Constants;
import residence.Residence;

/**
 * This class is the abstract class of main.java.residence.privateHomes.PrivateHome which is extended from main.java.residence.Residence
 *
 * @author Shilo Gilor
 */
public abstract class PrivateHome extends Residence {
    private double squareFootage;
    private int roomCount;

    /**
     *
     * @param cityName name of the city
     * @param streetName name of street
     * @param houseNumber house number within the street
     * @param squareFootage the square footage of the main.java.residence.privateHomes.Cottage
     * @param roomCount the amount of rooms in the apartment
     */
    public PrivateHome(String cityName, String streetName, int houseNumber, double squareFootage, int roomCount) {
        super(cityName, streetName, houseNumber);
        this.squareFootage = squareFootage;
        this.roomCount = roomCount;
    }

    /**
     * an abstract function to calculate the additional cost for the private home
     * @return the value to multiply that needs to add to the price
     */
    public abstract double additionalCost();

    /**
     * calculating the price of the private home
     * @return the price of the private home
     */
    public double getResidencePrice() {
        return (1 + Constants.squareFootageRate * this.squareFootage) * this.getBasePrice() + this.additionalCost();
    }
}
