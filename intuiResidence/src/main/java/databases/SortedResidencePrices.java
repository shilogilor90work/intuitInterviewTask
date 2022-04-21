package databases;

import residence.Residence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class is the database class for storing the residences by price to have a quick poll of data when searched
 *
 * @author Shilo Gilor
 */
public class SortedResidencePrices {
    private List<Residence> residencesPrices;

    /**
     * Constructor for the database
     * initialize the arrayList for storing the main.java.residence by price
     */
    public SortedResidencePrices() {
        this.residencesPrices = new ArrayList<>() {
            public boolean add(Residence residence) {
                super.add(residence);
                Collections.sort(residencesPrices);
                return true;
            }
        };
    }

    /**
     * add the main.java.residence to the database
     * @param residence the main.java.residence to be added to the database
     */
    public void add(Residence residence) {
        residencesPrices.add(residence);
    }

    /**
     * search for all residences that have lower price than Z
     * @param Z the value to search by
     * @return a list of residences that have a lower price than Z
     */
    public List<Residence> searchLowerThanPrice(double Z) {
        List<Residence> residenceList = new ArrayList<>();
        for (Residence residence : this.residencesPrices) {
            if (residence.getResidencePrice() < Z) {
                residenceList.add(residence);
            } else {
                break;
            }
        }
        return residenceList;
    }
}
