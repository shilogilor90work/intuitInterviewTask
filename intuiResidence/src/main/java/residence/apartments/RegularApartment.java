package residence.apartments;

import constants.Constants;

/**
 * This class is the Regular main.java.residence.apartments.Apartment which is extended from main.java.residence.apartments.Apartment
 *
 * @author Shilo Gilor
 */
public class RegularApartment extends Apartment{
    /**
     *
     * @param cityName name of the city
     * @param streetName name of street
     * @param houseNumber house number within the street
     * @param floorNumber floor number of witch you live in
     * @param apartmentNumber the apartment number
     * @param roomCount the amount of rooms in the apartment
     */
    public RegularApartment(String cityName, String streetName, int houseNumber, int floorNumber, int apartmentNumber, int roomCount) {
        super(cityName, streetName, houseNumber, floorNumber, apartmentNumber, roomCount);
    }

    /**
     * this is the clone apartment for helping the other apartments to calculate their price according to a regular apartment
     * @param apartment the apartment needed to be cloned for other apartments to calculate
     */
    public RegularApartment(Apartment apartment) {
        super(apartment.getCityName(), apartment.getStreetName(), apartment.getHouseNumber(), apartment.getFloorNumber(), apartment.getApartmentNumber(), apartment.getRoomCount());
    }

    /**
     * calculates the price of the Regular apartment
     * @return the price of this apartment
     */
    @Override
    public double getResidencePrice() {
        return this.getBasePrice() * this.getFloorPrice() * this.getRoomPrice();
    }

    /**
     * calculates the price of the Regular apartment based on an arbitrary floor
     * @param floorNumber the floor that we want to calculate the price
     * @return the price of the apartments value if it was in this specific floor
     */
    public double getResidencePrice(int floorNumber) {
        return this.getBasePrice() * this.getFloorPrice(floorNumber) * this.getRoomPrice();
    }

    /**
     * calculates the price for this apartment
     * @return the floor price value to multiply for the current apartment
     */
    private double getFloorPrice() {
        return Constants.apartmentFloorRate * this.getFloorNumber() + 1;
    }

    /**
     * calculates the arbitrary floor price based on the floor number given
     * @param floorNumber the floor number to use
     * @return the floor price rate based on the arbitrary floor
     */
    private double getFloorPrice(int floorNumber) {
        return Constants.apartmentFloorRate * floorNumber + 1;
    }

    /**
     * calculates the room price needed to multiply
     * @return the value to multiply for based on the room count
     */
    private double getRoomPrice() {
        return 1 + Constants.apartmentRoomRate * (this.getFloorNumber() - Constants.apartmentMinRoomCount);
    }

}
