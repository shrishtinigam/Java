import java.util.Scanner;
public class CustomizeFurniture_20BRS1193 extends FurnitureShop_20BRS1193{
    String customization;
    CustomizeFurniture_20BRS1193(){
        super();
        doCustomization();
    }
    void doCustomization(){
        System.out.println("Do you require customization? Enter 1 if yes, and 0 if no.");
        Scanner sc = new Scanner(System.in);
        int requireCust = sc.nextInt();
        if(requireCust == 0)
            this.customization = "NIL";
        else{
            System.out.println("What customization would you like to do on your "+ super.furnitureBought + " ?");
            this.customization = sc.next();
        }
        System.out.println();
    }
}
