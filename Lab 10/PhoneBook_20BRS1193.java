import java.io.FileReader;
import java.io.BufferedReader;
import java.util.HashMap;
public class PhoneBook_20BRS1193 {
    
    public static void main(String args[]){
        HashMap<String,String> map = new HashMap<String,String>();  
        
        try{
            String name;
            String phoneNumber;
            FileReader fr = new FileReader("PhoneBook.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();    
            while(line!= null){
                String[] temp = line.split(" ");    
                name = temp[0] + " " + temp[1];
                phoneNumber = temp[2];
                map.put(name, phoneNumber);
                line = br.readLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(map);

        System.out.println("\nL. Look up a phone number.");
        System.out.println("Searching for a phone number... of Maria Luna");
        String phoneNumber = map.get("Maria Luna");
        System.out.println("Maria Luna's phone number is " + phoneNumber);

        System.out.println("\nA. Add or change a phone number.");
        System.out.println("Adding or changing a phone number...");
        map.put("Sarah Island", "(284)243-2729");
        map.replace("Stephen Kelley", "(884)983-2329");
        System.out.println(map);

        System.out.println("\nR. Remove an entry from your phone directory.");
        System.out.println("Removing a phone number...");
        map.remove("Maria Luna");
        System.out.println(map);
        
        System.out.println("\nD. List the entire phone directory.");
        System.out.println(map); // or using an iterator
        for (HashMap.Entry<String,String> entry : map.entrySet()) 
            System.out.println("Name = " + entry.getKey() + ", Phone Number = " + entry.getValue());

        System.out.println("\nE. Exit from the program");
        System.exit(0);
    }
}
