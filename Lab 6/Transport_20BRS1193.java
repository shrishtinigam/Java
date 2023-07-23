public class Transport_20BRS1193 extends CustomizeFurniture_20BRS1193{
    final int MAX_FREE_DISTANCE = 5;
    int transportationCharges;
    void transportCharges(){
        if(distanceFromShop >= MAX_FREE_DISTANCE)
            transportationCharges = 500;
        else
            transportationCharges = 0;
    }

    Transport_20BRS1193(){
        super();
        transportCharges();
    }
    void display(){
        System.out.println("Furniture purchased: " + furnitureBought);
        System.out.println("Customizations added: " + customization);
        System.out.println("Transportation charges: " + transportationCharges);
    }
}
