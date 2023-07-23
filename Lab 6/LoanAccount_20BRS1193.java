import java.util.Scanner;
class LoanAccount_20BRS1193 extends BankCustomer_20BRS1193{
    private int loanAccountNo;
    int loanAmount;
    String loanType;
    LoanAccount_20BRS1193(){
        super();
        getLoanDetails();
    }
    void getLoanDetails(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Loan Account: ");
        this.loanAccountNo = sc1.nextInt();
        System.out.println("Loan Amount: ");
        this.loanAmount = sc1.nextInt();
        System.out.println("Loan Type: ");
        this.loanType = sc1.next();
    }

    void display(){
        System.out.println("Loan Account No: " + this.loanAccountNo);
        System.out.println("Loan Amount: " + this.loanAmount);
        System.out.println("Loan Type: " + this.loanType);
        System.out.println("Aadhar No: " + getAadharNo());
        System.out.println("PAN No: " + getPANNo());
    }
}