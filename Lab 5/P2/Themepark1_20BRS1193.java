public class Themepark1_20BRS1193 extends Themepark_20BRS1193{
    
    Themepark1_20BRS1193(String name, int age, String gender, String city){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }
    
    public void playDiving() {
        if(age < 18){
            swimming = false;
            System.out.println("You are not allowed to play diving.");
            return;
        }
        swimming = true;
        System.out.println("You are allowed to play diving.");
    }
}
