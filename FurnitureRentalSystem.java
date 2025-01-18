import java.util.Scanner;
import java.util.ArrayList;
import furniturerental.Furniture;
import furniturerental.FurnitureCompany;
import furniturerental.FurnitureRent;


public class FurnitureRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        char ch;

        System.out.println("Do you want to check our catalogue? (y/n)");
        ch = sc.next().charAt(0);
        String itemName;

        switch (ch) {
            case 'y':
            case 'Y': {
                System.out.println("Item_Name\tDeposit\t\tRate");
                FurnitureCompany fc = new FurnitureCompany();
                fc.furnitureDetails();

                ArrayList<Furniture> furnitureList = fc.getList();
                for (i = 0; i < furnitureList.size(); i++) {
                    Furniture current_furniture = furnitureList.get(i);
                    System.out.print(current_furniture.getItemName() + "\t\t");
                    System.out.print(current_furniture.getDeposit() + "\t\t");
                    System.out.print(current_furniture.getRate() + "\t");
                    System.out.println();
                }

                System.out.println("Enter the item name:");
                itemName = sc.next();
                FurnitureRent fr = new FurnitureRent();
                fr.getRentDetails(itemName);
                break;
            }
            case 'n':
            case 'N': {
                System.out.println("Enter the item name:");
                itemName = sc.next();
                FurnitureRent fr = new FurnitureRent();
                fr.getRentDetails(itemName);
                break;
            }
        }
    }
}

