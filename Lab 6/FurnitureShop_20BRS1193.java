import java.util.Scanner;
public class FurnitureShop_20BRS1193 {
    String [] furnitures;
    String name;
    String address;
    String phoneNo;
    int distanceFromShop;
    String furnitureBought;

    void getFurnitures(){
        System.out.println("Furniture catalougue: ");
        for(int i = 0; i < this.furnitures.length; i++){
            System.out.println((i+1) + " " + furnitures[i]);
        }
    }

    FurnitureShop_20BRS1193(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of furnitures at your store: ");
        int noOfFurnitures = 0;
        do{
            noOfFurnitures = sc.nextInt();
        }while(noOfFurnitures <= 0);

        System.out.println("Enter " + noOfFurnitures +" furniture names: ");

        String [] furnituresEntered = new String [noOfFurnitures];
        String furniture;
        for(int i = 0; i < noOfFurnitures; i++){
            furniture = sc.next();
            furnituresEntered[i] = furniture;
        }
        this.furnitures = furnituresEntered;
        getFurnitures();
        getCustomerDetails();
        System.out.println();
    }

    void getCustomerDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        this.name = sc.next();
        System.out.println("Address: ");
        this.address = sc.next();
        System.out.println("Phone No.: ");
        this.phoneNo = sc.next();
        System.out.println("Distance from Shop in kilometres: ");
        this.distanceFromShop = sc.nextInt();
        System.out.println("Please choose a furniture from our catalogue.");
        this.getFurnitures();
        System.out.println("Enter the furniture index you would like to buy: ");
        int furnitureIndex = sc.nextInt();
        furnitureBought = furnitures[furnitureIndex - 1];
    }

}
