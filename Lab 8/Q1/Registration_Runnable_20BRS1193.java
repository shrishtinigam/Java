import java.util.Scanner;
public class Registration_Runnable_20BRS1193 implements Runnable {
    String reg_no;
    String slot;
    static int D1_Students = 0;
    static int D2_Students = 0;
    
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter register no: ");
        this.reg_no = sc.nextLine();
        System.out.println("Enter slot preference: ");
        int slot_preference = sc.nextInt();
        if(slot_preference == 1)
            this.Slot_D1();
        else if(slot_preference == 2)
            this.Slot_D2();
        this.print();
    }
    
    public void Slot_D1(){
        this.slot = "D1";
        System.out.println("Slot chosen as D1");
        D1_Students++;
    }
    public void Slot_D2(){
        this.slot = "D2";
        System.out.println("Slot chosen as D2");
        D2_Students++;
    }

    public void print(){
        System.out.println("Reg No:" + this.reg_no);
        System.out.println("Slot:" + this.slot);
        System.out.println("Number of students D1 slot:" + D1_Students);
        System.out.println("Number of students D2 slot:" + D2_Students);
        System.out.println();
    }

    public static void main (String args[]){
        Registration_Runnable_20BRS1193 stu1 = new Registration_Runnable_20BRS1193();
        stu1.run();
        Registration_Runnable_20BRS1193 stu2 = new Registration_Runnable_20BRS1193();
        stu2.run();
        Registration_Runnable_20BRS1193 stu3 = new Registration_Runnable_20BRS1193();
        stu3.run();
    }
}
