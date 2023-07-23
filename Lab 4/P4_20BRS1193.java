public class P4_20BRS1193 {
    String name;
    static int studentCount = 0;
    int regNo;
    String emailID;
    String mobileNumber;

    public void displayStudent(){
        System.out.println("NAME:" + this.name);
        System.out.println("REG NO:" + this.regNo);
        System.out.println("EMAIL ID:" + this.emailID);
        System.out.println("MOBILE NO:" + this.mobileNumber);
        System.out.println("STUDENT COUNT:" + studentCount);
        System.out.println();
    }

    P4_20BRS1193(String name, int regNo, String emailID, String mobileNumber){
        this.name = name;
        this.regNo = regNo;
        this.emailID = emailID;
        this.mobileNumber = mobileNumber;
        studentCount++;
    }

    public static void main(String args[]){
        P4_20BRS1193 p1 = new P4_20BRS1193("Meher Shrishti Nigam", 32847394,  "meher123@gmail.com", "9127449257");
        p1.displayStudent();
        P4_20BRS1193 p2 = new P4_20BRS1193("Sai Samyukta",  32847435,"samyukta123@gmail.com", "9136299268");
        p2.displayStudent();
        P4_20BRS1193 p3 = new P4_20BRS1193("Neha Nambiar",  32847896,"neha123@gmail.com", "8267449232");
        p3.displayStudent();
        P4_20BRS1193 p4 = new P4_20BRS1193("Shivam Akhouri", 32847483,"shivam123@gmail.com", "9827449229");
        p4.displayStudent();
        P4_20BRS1193 p5 = new P4_20BRS1193("Suraj Shah", 32847953,"suraj123@gmail.com", "9927449221");
        p5.displayStudent();
    }
}
