import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
class BankCustomer_20BRS1193 {
    private int aadharNo;
    private int PAN;
    String name;
    Date dob;
    String address;

    BankCustomer_20BRS1193(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Aadhar No: ");
        this.aadharNo = sc.nextInt();
        System.out.println("PAN No: ");
        this.PAN = sc.nextInt();
        System.out.println("Name: ");
        this.name = sc.next();
        System.out.println("Date of Birth: ");
        String rdob =  sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.dob = dateFormat.parse(rdob);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Address: ");
        this.address = sc.next();
    }

    int getAadharNo() {
        return this.aadharNo;
    }

    int getPANNo() {
        return this.PAN;
    }
}
