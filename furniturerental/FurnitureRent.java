package furniturerental;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureRent {
    static Scanner sc = new Scanner(System.in);
    String name;
    String phNum;
    static int cost;
    static int days;

    public void getDetails() {
        System.out.println("Enter your name:");
        name = sc.next();
        System.out.println("Enter your phone number:");
        phNum = sc.next();
    }

    public static void getRentDetails(String itemName) {
        FurnitureRent fr = new FurnitureRent();
        int check = 0;
        fr.getDetails();

        System.out.print("Enter the number of days of rent: ");
        days = sc.nextInt();
        FurnitureCompany fc = new FurnitureCompany();

        ArrayList<Furniture> furnitureList = fc.getList();
        int i;
        for (i = 0; i < furnitureList.size(); i++) {
            Furniture current_furniture = furnitureList.get(i);
            if (itemName.equals(current_furniture.getItemName())) {
                check = 1;
                break;
            }
        }

        if (i == furnitureList.size() || check == 0) {
            System.out.println("Item not available");
        } else {
            System.out.println("\n\n*************** Details *****************");
            Furniture current_furniture1 = furnitureList.get(i);
            cost = (days * current_furniture1.getRate()) + current_furniture1.getDeposit();
            System.out.println("Deposit  Daily_Rate  Duration  Total_Cost");
            System.out.println(current_furniture1.getDeposit() + "\t\t\t" + current_furniture1.getRate() + "\t" + days + "\t" + cost);
            System.out.print("Proceed to rent? (y/n): ");
            String dec = sc.next();
            if (dec.equals("y")) {
                fr.getReceipt(itemName);
            } else if (dec.equals("n")) {
                System.out.println("Thank You!");
            }
        }
    }

    public void getReceipt(String itemName) {
        System.out.println("\n\n ************ Receipt *************");
        System.out.println("Name\tPhone_Number Item\tDuration  Cost");
        System.out.println(name + "\t" + phNum + "\t\t" + itemName + "\t" + days + "\t" + cost);
        System.out.println("Thank You!");
    }
}

