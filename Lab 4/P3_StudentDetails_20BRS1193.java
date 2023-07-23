import java.util.Date;
public class P3_StudentDetails_20BRS1193 {
    String name;
    static int registration = 202201;
    int registrationNo;
    String department;
    Date dob;
    String emailID;
    String mobileNumber;

    private static final long MILLIS_IN_A_DAY = 1000 * 60 * 60 * 24;

    P3_StudentDetails_20BRS1193(String name, String department, Date dob, String emailID, String mobileNumber){
        this.name = name;
        this.registrationNo = registration;
        registration++;
        this.department = department;
        this.dob = dob;
        this.emailID = emailID;
        this.mobileNumber = mobileNumber;
    }

    public void printDetails(){
        System.out.println("NAME: " + this.name);
        System.out.println("REGISTRATION NO.: " + this.registrationNo);
        System.out.println("DEPARTMENT: " + this.department);
        System.out.println("DATE OF BIRTH: " + this.dob.toString());
        System.out.println("EMAIL ID: " + this.emailID);
        System.out.println("MOBILE NUMBER: " + this.mobileNumber);
        System.out.println();
    }
    public static void main(String args[]){
        Date date = new Date();
        Date myBirthday = new Date(date.getTime() - MILLIS_IN_A_DAY * 365 * 20);
        P3_StudentDetails_20BRS1193 p1 = new P3_StudentDetails_20BRS1193("Meher Shrishti Nigam", "Computer Science Engineering", myBirthday, "meher123@gmail.com", "9127449257");

        myBirthday = new Date(date.getTime() - MILLIS_IN_A_DAY * 365 * 19);
        P3_StudentDetails_20BRS1193 p2 = new P3_StudentDetails_20BRS1193("Sai Samyukta", "Robotics Engineering", myBirthday, "samyukta123@gmail.com", "9136299268");

        myBirthday = new Date(date.getTime() - MILLIS_IN_A_DAY * 365 * 18);
        P3_StudentDetails_20BRS1193 p3 = new P3_StudentDetails_20BRS1193("Neha Nambiar", "Cybersecurity Engineering", myBirthday, "neha123@gmail.com", "8267449232");

        myBirthday = new Date(date.getTime() - MILLIS_IN_A_DAY * 365 * 17);
        P3_StudentDetails_20BRS1193 p4 = new P3_StudentDetails_20BRS1193("Shivam Akhouri", "Machine Learning Engineering", myBirthday, "shivam123@gmail.com", "9827449229");

        myBirthday = new Date(date.getTime() - MILLIS_IN_A_DAY * 365 * 18);
        P3_StudentDetails_20BRS1193 p5 = new P3_StudentDetails_20BRS1193("Suraj Shah", "Cloud Computing Engineering", myBirthday, "suraj123@gmail.com", "9927449221");

        p1.printDetails();
        p2.printDetails();
        p3.printDetails();
        p4.printDetails();
        p5.printDetails();
    }
}
