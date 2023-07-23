import java.util.Scanner;
public class ThemeparkTicket_20BRS1193 {
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

        while(park != 1 && park != 2){
            System.out.println("Not valid.");
            park = sc.nextInt();
        }
        if(park == 1){
            Themepark1_20BRS1193 t1 = new Themepark1_20BRS1193(name, age, gender, city);
            t1.playDiving();
        }else if(park == 2){
            Themepark2_20BRS1193 t1 = new Themepark2_20BRS1193(name, age, gender, city);
            t1.playDiving();
        }
        sc.close();
    }
}
