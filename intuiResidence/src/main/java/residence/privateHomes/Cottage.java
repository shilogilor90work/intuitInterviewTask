package residence.privateHomes;

import constants.Constants;

/**
 * This class is the main.java.residence.privateHomes.Cottage class which is extended from main.java.residence.privateHomes.PrivateHome
 *
 * @author Shilo Gilor
 */
public class Cottage extends PrivateHome{
    /**
     * Constructor for main.java.residence.privateHomes.Cottage

     * @param cityName name of the city
     * @param streetName name of street
     * @param houseNumber house number within the street
     * @param squareFootage the square footage of the main.java.residence.privateHomes.Cottage
     * @param roomCount the amount of rooms in the apartment
     */
    public Cottage(String cityName, String streetName, int houseNumber, double squareFootage, int roomCount) {
        super(cityName, streetName, houseNumber, squareFootage, roomCount);
    }

    /**
     * the additional cost that a main.java.residence.privateHomes.Cottage has
     * @return the value to multiply as the additional cost
     */
    @Override
    public double additionalCost() {
        return (1 + Constants.cottageAdditionRate) * this.getBasePrice();
    }
}
