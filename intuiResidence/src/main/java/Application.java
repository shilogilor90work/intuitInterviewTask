import databases.SearchAddress;
import databases.SortedResidencePrices;
import residence.Residence;

import java.util.List;

/**
 * This class is the application for the apartment task
 *
 * @author Shilo Gilor
 */
public class Application {
    private SearchAddress searchAddress;
    private SortedResidencePrices sortedResidencePrices;

    /**
     * Constructor for the application, here we need to initialize the database types.
     */
    public Application() {
        this.searchAddress = new SearchAddress();
        this.sortedResidencePrices = new SortedResidencePrices();
    }

    /**
     * add the main.java.residence to the database
     * @param residence the main.java.residence that we want to add to the database
     */
    public void addResidence(Residence residence) {
        this.searchAddress.add(residence);
        this.sortedResidencePrices.add(residence);
    }

    /**
     * the search function by city
     * @param cityName the city name that we want to search by
     * @return  a List of residences that are in the requested city
     */
    public List<Residence> searchByCity(String cityName) {
        return this.searchAddress.get(cityName);
    }

    /**
     * the search function by city and street
     * @param cityName the city name that we want to search by
     * @param streetName the street name that we want to search by
     * @return a List of residences that are in the requested city and street
     */
    public List<Residence> searchByAddress(String cityName, String streetName) {
        return this.searchAddress.get(cityName, streetName);
    }

    /**
     * the search function by the price limit
     * @param Z is the price limit that we want to search by
     * @return a List of residences that have a price lower than Z
     */
    public List<Residence> searchLowerThanPrice(double Z) {
        return this.sortedResidencePrices.searchLowerThanPrice(Z);
    }
}
