package P3;
import java.util.Scanner;
public class ThemeparkTicket2_20BRS1193 {
    public static void main(String args[]){
        System.out.println("Do you want a ticket for Themepark 1 or 2?");
        Scanner sc = new Scanner(System.in);
        int park = sc.nextInt();

        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter gender: ");
        String gender = sc.next();
        System.out.println("Enter city: ");
        String city = sc.next();
        System.out.println("Enter 1 if you can swim, 0 if not: ");
        boolean swimming = false;
        int isSwim = sc.nextInt();
        if(isSwim == 1)
            swimming = true;

        while(park != 1 && park != 2){
            System.out.println("Not valid.");
            park = sc.nextInt();
        }
        if(park == 1){
            Themepark1_20BRS1193 t1 = new Themepark1_20BRS1193();
            t1.getVisitorDetails(name, age, gender, city, swimming);
            t1.playDiving();
        }else if(park == 2){
            Themepark2_20BRS1193 t1 = new Themepark2_20BRS1193();
            t1.getVisitorDetails(name, age, gender, city, swimming);
            t1.playDiving();
            t1.playWaterSports();
        }
        sc.close();
    }
}

