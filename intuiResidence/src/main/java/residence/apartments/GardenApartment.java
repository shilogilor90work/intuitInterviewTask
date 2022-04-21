package residence.apartments;

import constants.Constants;

/**
 * This class is the Garden main.java.residence.apartments.Apartment which is extended from main.java.residence.apartments.Apartment
 *
 * @author Shilo Gilor
 */
public class GardenApartment extends Apartment {
    /**
     * Constructor for main.java.residence.apartments.GardenApartment
     * @param cityName name of the city
     * @param streetName name of street
     * @param houseNumber house number within the street
     * @param floorNumber floor number of witch you live in
     * @param apartmentNumber the apartment number
     * @param roomCount the amount of rooms in the apartment
     */
    public GardenApartment(String cityName, String streetName, int houseNumber, int floorNumber, int apartmentNumber, int roomCount) {
        super(cityName, streetName, houseNumber, floorNumber, apartmentNumber, roomCount);
    }

    /**
     * get the price of this garden apartment
     * @return the price of this current garden apartment
     */
    @Override
    public double getResidencePrice() {
        RegularApartment regularApartment = new RegularApartment(this);
        return regularApartment.getResidencePrice(1) + Constants.gardenApartmentRate * regularApartment.getResidencePrice(2);
    }
}
