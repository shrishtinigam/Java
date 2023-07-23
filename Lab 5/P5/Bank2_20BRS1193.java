package P5;

public class Bank2_20BRS1193 implements Bank_20BRS1193{
    int accountNumber;
    int accountOpenYear;
    String name;
    int age;
    int averageYearlyBalance; 
    int balance;

    public void checkPreviligeCustomer(){
        System.out.print("Name:" + name + ", Account No:" + accountNumber);
        if(averageYearlyBalance >= 200000 && accountOpenYear <= (CUR_YEAR - 4)){
            System.out.println(", you are a priviliged customer.");
            return;
        }
        System.out.println(", you are not a priviliged customer.");
    }

    public void getCustomerDetails(int accountNumber, int accountOpenYear, String name, int age, int averageYearlyBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountOpenYear = accountOpenYear;
        this.age = age;
        this.averageYearlyBalance = averageYearlyBalance; 
    }
}
