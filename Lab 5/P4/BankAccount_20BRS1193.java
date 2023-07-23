package P4;
import java.util.Scanner;
public class BankAccount_20BRS1193 {
    public static void main(String args[]){
        System.out.println("Do you want to opena bank account in Bank 1 or Bank 2?");
        
        Scanner sc = new Scanner(System.in);
        int bank = sc.nextInt();
        
        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter account open year: ");
        int accountOpenYear = sc.nextInt();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter average yearly balance: ");
        int averageYearlyBalance = sc.nextInt();

        while(bank != 1 && bank != 2){
            System.out.println("Not valid.");
            bank = sc.nextInt();
        }
        if(bank == 1){
            Bank1_20BRS1193 t1 = new Bank1_20BRS1193();
            t1.getCustomerDetails(accountNumber, accountOpenYear, name, age, averageYearlyBalance);
            t1.checkPreviligeCustomer();
        }else if(bank == 2){
            Bank2_20BRS1193 t1 = new Bank2_20BRS1193();
            t1.getCustomerDetails(accountNumber, accountOpenYear, name, age, averageYearlyBalance);
            t1.checkPreviligeCustomer();
        }
        sc.close();
    }
}
