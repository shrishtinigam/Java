import java.util.Scanner;
class SavingsAccount_20BRS1193 extends BankCustomer_20BRS1193{
    private int sbAccountNo;
    int balance;
    SavingsAccount_20BRS1193(){
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Saving Account No: ");
        this.sbAccountNo = sc.nextInt();
        System.out.println("Balance Amount: ");
        this.balance = sc.nextInt();
        sc.close();
    }

    void display(){
        System.out.println("Saving Account No: " + this.sbAccountNo);
        System.out.println("Balance Amount: " + this.balance);
        System.out.println("Aadhar No: " + getAadharNo());
        System.out.println("PAN No: " + getPANNo());
    }

   
}
