import residence.*;
import residence.apartments.GardenApartment;
import residence.apartments.RegularApartment;
import residence.privateHomes.Cottage;
import residence.privateHomes.Vila;

public class Main {
    public static void main(String[] args) {
        Application app = new Application();

        Residence regularApartment1 = new RegularApartment("Haifa", "Ben-Gurion", 20,17,49, 4);
        Residence regularApartment2 = new RegularApartment("Haifa", "Ben-Gurion", 2,1,4, 6);
        Residence regularApartment3 = new RegularApartment("Tel-Aviv", "Namir", 5,7,5, 1);
        Residence regularApartment4 = new RegularApartment("Yahud", "Ben-Gurion", 7,2,10, 3);

        Residence gardenApartment1 = new GardenApartment("Haifa", "Ben-Gurion", 3,1,1, 2);
        Residence gardenApartment2 = new GardenApartment("Haifa", "aba-hilel", 2,2,4, 6);
        Residence gardenApartment3 = new GardenApartment("Haifa", "Ben-Gurion", 10,3,16, 10);
        Residence gardenApartment4 = new GardenApartment("Haifa", "aba-hilel", 8,3,20, 7);
        Residence gardenApartment5 = new GardenApartment("Tel-Aviv", "Namir", 3,1,7, 2);

        Residence cottage1 = new Cottage("Tel-Aviv", "Namir", 2, 100, 3);
        Residence cottage2 = new Cottage("Tel-Aviv", "Namir", 4, 200, 5);
        Residence cottage3 = new Cottage("Haifa", "Namir", 6, 300, 7);
        Residence cottage4 = new Cottage("Tel-Aviv", "Namir", 8, 210, 6);
        Residence cottage5 = new Cottage("Tel-Aviv", "Namir", 10, 1000, 9);

        Residence vila1 = new Vila("Tel-Aviv", "Namir", 2, 80, 2);
        Residence vila2 = new Vila("Haifa", "Zait", 7, 246, 5);
        Residence vila3 = new Vila("Tel-Aviv", "Namir", 12, 180, 3);
        Residence vila4 = new Vila("Tel-Aviv", "Namir", 37, 112, 3);
        Residence vila5 = new Vila("Tel-Aviv", "Namir", 39, 184, 4);


        app.addResidence(regularApartment1);
        app.addResidence(regularApartment2);
        app.addResidence(regularApartment3);
        app.addResidence(regularApartment4);

        app.addResidence(gardenApartment1);
        app.addResidence(gardenApartment2);
        app.addResidence(gardenApartment3);
        app.addResidence(gardenApartment4);
        app.addResidence(gardenApartment5);

        app.addResidence(cottage1);
        app.addResidence(cottage2);
        app.addResidence(cottage3);
        app.addResidence(cottage4);
        app.addResidence(cottage5);

        app.addResidence(vila1);
        app.addResidence(vila2);
        app.addResidence(vila3);
        app.addResidence(vila4);
        app.addResidence(vila5);

        System.out.println(app.searchLowerThanPrice(1700000));
        System.out.println(app.searchLowerThanPrice(2000000));
        System.out.println(app.searchLowerThanPrice(8000000));

        System.out.println(app.searchByCity("Haifa"));
        System.out.println(app.searchByCity("Tel-Aviv"));

        System.out.println(app.searchByAddress("Yahud", "Ben-Gurion"));
        System.out.println(app.searchByAddress("Haifa", "Ben-Gurion"));
        System.out.println(app.searchByAddress("Haifa", "aba-hilel"));
        System.out.println(app.searchByAddress("Tel-Aviv", "Namir"));



    }
}


