import java.io.*;

public class Donor_20BRS1193 {

    String name;
    int age;
    String address;
    String contactNumber;
    String bloodGroup;
    int daysSinceLastDonation;

    Donor_20BRS1193(String name,
            int age,
            String address,
            String contactNumber,
            String bloodGroup ,
            int daysSinceLastDonation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
        this.daysSinceLastDonation = daysSinceLastDonation;
    }

    public static void main(String args[]) {
    
        Donor_20BRS1193 d1 = new Donor_20BRS1193("Meher", 20, "Chennai", "9998887776", "AB+ve", 200);
        
        Donor_20BRS1193 d2 = new Donor_20BRS1193("Shrishti", 18, "Mumbai", "9998887775", "O+ve", 300);

        Donor_20BRS1193 d3 = new Donor_20BRS1193("Nigam", 19, "Bangalore", "9998887774", "A+ve", 290);

        Donor_20BRS1193 d4 = new Donor_20BRS1193("Shashwat", 21, "Mumbai", "9998887773", "B-ve", 100);

        Donor_20BRS1193 d5 = new Donor_20BRS1193("Neelam", 22, "Chennai", "9998887772", "B+ve", 50);

        Donor_20BRS1193 d6 = new Donor_20BRS1193("Sanjay", 23, "Kolkata", "9998887771", "A+ve", 100);

        Donor_20BRS1193 d7 = new Donor_20BRS1193("Radhika", 24, "Jamnagar", "9998887770", "A+ve", 250);
        
        
        try{
            
            FileOutputStream fileStream = new FileOutputStream("ObjectFile.txt");
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

        try {
            FileInputStream fileStream1 = new FileInputStream("ObjectFile.txt");
            ObjectInputStream objStream1 = new ObjectInputStream(fileStream1);
            Donor_20BRS1193 dnew = (Donor_20BRS1193) objStream1.readObject();
            fileStream1.close();
            objStream1.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
