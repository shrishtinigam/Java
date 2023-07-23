package P4;

public class Bank1_20BRS1193 extends Bank_20BRS1193{
    public void checkPreviligeCustomer(){
        System.out.print("Name:" + name + ", Account No:" + accountNumber);
        if(averageYearlyBalance >= 100000 && accountOpenYear <= (CUR_YEAR - 5)){
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
