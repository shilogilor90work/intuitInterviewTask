package databases;

import residence.Residence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This class is the database class for storing the residences by city and street to have a quick poll of data when searched
 *
 * @author Shilo Gilor
 */
public class SearchAddress {
    private Map<String, Map<String, Map<Integer, Residence>>> searchAddress;

    /**
     * Constructor for the database
     * initialize the hashmap for storing the main.java.residence
     */
    public SearchAddress() {
        this.searchAddress = new HashMap<>();;
    }

    /**
     * add the main.java.residence to the database
     * @param residence the main.java.residence to be added to the database
     */
    public void add(Residence residence) {
        if (this.searchAddress.containsKey(residence.getCityName())) {
            this.updateCity(residence);
        } else {
            this.createCity(residence);
        }
    }

    /**
     * update the city database
     * @param residence the main.java.residence to be added to the database
     */
    private void updateCity(Residence residence) {
        if (this.searchAddress.get(residence.getCityName()).containsKey(residence.getStreetName())) {
            this.updateStreet(residence);
        } else {
            this.createStreet(residence);
        }
    }

    /**
     * update the street database
     * @param residence the main.java.residence to be added to the database
     */
    private void updateStreet(Residence residence) {
        this.searchAddress.get(residence.getCityName()).get(residence.getStreetName()).put(residence.getHouseNumber(), residence);
    }

    /**
     * initializing the database for the new street name
     * @param residence the main.java.residence to be added to the database
     */
    private void createStreet(Residence residence) {
        HashMap<Integer, Residence> streetNumberMap = new HashMap<>();
        streetNumberMap.put(residence.getHouseNumber(), residence);
        this.searchAddress.get(residence.getCityName()).put(residence.getStreetName(), streetNumberMap);
    }

    /**
     * initializing the database for the new city name
     * @param residence the main.java.residence to be added to the database
     */
    private void createCity(Residence residence) {
        HashMap<Integer, Residence> streetNumberMap = new HashMap<>();
        streetNumberMap.put(residence.getHouseNumber(), residence);
        HashMap<String, Map<Integer, Residence>> streetMap = new HashMap<>();
        streetMap.put(residence.getStreetName(), streetNumberMap);
        this.searchAddress.put(residence.getCityName(), streetMap);
    }

    /**
     * get all the residences that are in this city by name
     * @param cityName the city name we are searching
     * @return a list of main.java.residence that fit the search
     */
    public List<Residence> get(String cityName) {
        return this.searchAddress.get(cityName).values().stream().flatMap(mapOfMap -> mapOfMap.values().stream()).collect(Collectors.toList());
    }

    /**
     * get all the residences that are in this city name and street name
     * @param cityName the city name we are searching
     * @param streetName the street name we are searching
     * @return a list of main.java.residence that fit the search
     */
    public List<Residence> get(String cityName, String streetName) {
        return new ArrayList<>(this.searchAddress.get(cityName).get(streetName).values());
    }
}
