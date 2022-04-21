package residence.apartments;

import residence.Residence;

/**
 * This class is an abstract main.java.residence.apartments.Apartment class
 *
 * @author Shilo Gilor
 */
public abstract class Apartment extends Residence {

    private int floorNumber;
    private int apartmentNumber;
    private int roomCount;

    /**
     *
     * @param cityName name of the city
     * @param streetName name of street
     * @param houseNumber house number within the street
     * @param floorNumber floor number of witch you live in
     * @param apartmentNumber the apartment number
     * @param roomCount the amount of rooms in the apartment
     */
    public Apartment(String cityName, String streetName, int houseNumber, int floorNumber, int apartmentNumber, int roomCount) {
        super(cityName, streetName, houseNumber);
        this.floorNumber = floorNumber;
        this.apartmentNumber = apartmentNumber;
        this.roomCount = roomCount;
    }

    /**
     * getter for floor number
     * @return floor number
     */
    public int getFloorNumber() {
        return floorNumber;
    }

    /**
     * getter for apartment number
     * @return apartment number
     */
    public int getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * getter for room count
     * @return the room count within the apartment
     */
    public int getRoomCount() {
        return roomCount;
    }

    /**
     * abstract of calculating the price of the apartment
     * @return the apartment price
     */
    abstract public double getResidencePrice();
}
