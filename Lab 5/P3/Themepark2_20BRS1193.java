package P3;
public class Themepark2_20BRS1193 implements Themepark_20BRS1193{
    String name;
    int age;
    String gender;
    String city;
    boolean swimming;

    public void getVisitorDetails(String name, int age, String gender, String city, boolean swimming){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.swimming = swimming;
    }

    public boolean playDiving() {
        if(!swimming || age < 21){
            swimming = false;
            System.out.println("You are not allowed to play diving.");
            return false;
        }
        swimming = true;
        System.out.println("You are allowed to play diving.");
        return true;
    }

    public void playWaterSports() {
        if(swimming && age >= 21){
            System.out.println("You are allowed to play water sports.");
            return;
        }
        System.out.println("You are not allowed to play water sports.");
    }
}
