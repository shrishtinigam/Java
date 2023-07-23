public class SwimmingPool_20BRS1193 {

        static void validate(int age, boolean knowsSwimming) throws InvalidAgeException_20BRS1193, SwimmingNotKnownException_20BRS1193{
            if(age<18)
                throw new InvalidAgeException_20BRS1193("Not valid age");
            if(!knowsSwimming)
                throw new SwimmingNotKnownException_20BRS1193("Doesn't know swimming.");
            else 
                System.out.println("You're allowed to swim based on age.");
        }
        public static void main(String args[]){
        try{
            validate(18, true);
            validate(13, true);
            validate(34, false);
        }
        catch(Exception m){
            System.out.println("Exception occured: " + m);
        }
    }
}
