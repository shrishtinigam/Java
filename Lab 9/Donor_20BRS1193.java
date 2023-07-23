import java.util.Date;
import java.io.*;
import java.text.NumberFormat.Style;
import java.util.ArrayList;

public class Donor_20BRS1193 implements Serializable{
    private static final long MILLIS_IN_A_DAY = 1000 * 60 * 60 * 24;

    String name;
    int age;
    String address;
    String contactNumber;
    String bloodGroup;
    Date dateOfLastDonation;

    Donor_20BRS1193(){};
    Donor_20BRS1193(String name,
            int age,
            String address,
            String contactNumber,
            String bloodGroup ,
            Date dateOfLastDonation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
        this.dateOfLastDonation = dateOfLastDonation;
    }

    public static void main(String args[]) {
        Date date = new Date();
        Date lastDonation = new Date(date.getTime() - MILLIS_IN_A_DAY * 100);
        Donor_20BRS1193 d1 = new Donor_20BRS1193("Meher", 20, "Chennai", "9998887776", "AB+ve", lastDonation);
        
        lastDonation = new Date(date.getTime() - MILLIS_IN_A_DAY * 200);
        Donor_20BRS1193 d2 = new Donor_20BRS1193("Shrishti", 18, "Mumbai", "9998887775", "O+ve", lastDonation);

        lastDonation = new Date(date.getTime() - MILLIS_IN_A_DAY * 300);
        Donor_20BRS1193 d3 = new Donor_20BRS1193("Nigam", 19, "Bangalore", "9998887774", "A+ve", lastDonation);

        lastDonation = new Date(date.getTime() - MILLIS_IN_A_DAY * 50);
        Donor_20BRS1193 d4 = new Donor_20BRS1193("Shashwat", 21, "Mumbai", "9998887773", "B-ve", lastDonation);

        lastDonation = new Date(date.getTime() - MILLIS_IN_A_DAY * 250);
        Donor_20BRS1193 d5 = new Donor_20BRS1193("Neelam", 22, "Chennai", "9998887772", "B+ve", lastDonation);

        lastDonation = new Date(date.getTime() - MILLIS_IN_A_DAY * 150);
        Donor_20BRS1193 d6 = new Donor_20BRS1193("Sanjay", 23, "Kolkata", "9998887771", "A+ve", lastDonation);

        lastDonation = new Date(date.getTime() - MILLIS_IN_A_DAY * 275);
        Donor_20BRS1193 d7 = new Donor_20BRS1193("Radhika", 24, "Jamnagar", "9998887770", "A+ve", lastDonation);
        
        
        try{
            
            FileOutputStream fileStream = new FileOutputStream("ObjectFile.ser");
            ObjectOutputStream objStream = new ObjectOutputStream(fileStream);

            objStream.writeObject(d1);
            objStream.writeObject(d2);
            objStream.writeObject(d3);
            objStream.writeObject(d4);
            objStream.writeObject(d5);
            objStream.writeObject(d6);
            objStream.writeObject(d7);
            fileStream.close();
            objStream.close();

        }catch(Exception e){
            System.out.println(e);
        }

        ArrayList<Donor_20BRS1193> donors = new ArrayList<>();
        
        try {
            FileInputStream fileStream = new FileInputStream("ObjectFile.ser");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);
            Object obj = objStream.readObject();
            Donor_20BRS1193 dnew = (Donor_20BRS1193) obj;
            donors.add(dnew);
            while(obj != null)
            {
                obj = objStream.readObject();
                dnew = (Donor_20BRS1193) obj;
                donors.add(dnew);
            }

            objStream.close();
            fileStream.close();
        }catch(Exception e ) { 
            System.out.println(e);
        }
        // Date six months ago
        Date sixMonthsAgo = new Date(date.getTime() - MILLIS_IN_A_DAY * 182);
        for(Donor_20BRS1193 d : donors){
            if((d.bloodGroup).equals("A+ve") && d.dateOfLastDonation.compareTo(sixMonthsAgo) <= 0)
            System.out.println("Name:" + d.name + " Age: " + d.age + " Address: " + d.address + " Contact Number:" + d.contactNumber + " Blood Group: " + d.bloodGroup + " Last Date of Donation: " + d.dateOfLastDonation);
        }
    }
}
