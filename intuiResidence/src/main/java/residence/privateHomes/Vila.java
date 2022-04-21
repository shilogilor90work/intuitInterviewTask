package residence.privateHomes;

import constants.Constants;

/**
 * This class is the main.java.residence.privateHomes.Vila class which is extended from main.java.residence.privateHomes.PrivateHome
 *
 * @author Shilo Gilor
 */
public class Vila extends PrivateHome {
    public Vila(String cityName, String streetName, int houseNumber, double squareFootage, int roomCount) {
        super(cityName, streetName, houseNumber, squareFootage, roomCount);
    }
    /**
     * the additional cost that a main.java.residence.privateHomes.Vila has
     * @return the value to multiply as the additional cost
     */
    @Override
    public double additionalCost() {
        return (1 + Constants.vilaAdditionRate) * this.getBasePrice();
    }
}
