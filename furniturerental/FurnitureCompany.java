package furniturerental;

import java.util.ArrayList;

public class FurnitureCompany {
    public static ArrayList<Furniture> furnitureList = new ArrayList<Furniture>();

    public static void furnitureDetails() {
        furnitureList.add(new Furniture("Sofa", 200, 50));
        furnitureList.add(new Furniture("Bed", 300, 80));
        furnitureList.add(new Furniture("Table", 100, 30));
        furnitureList.add(new Furniture("Lamp", 150, 50));
        furnitureList.add(new Furniture("Chairs", 120, 40));
        furnitureList.add(new Furniture("Couch", 500, 150));
        furnitureList.add(new Furniture("Cushion", 150, 50));
        furnitureList.add(new Furniture("Carpet", 450, 200));
    }

    public static ArrayList<Furniture> getList() {
        return furnitureList;
    }
}


