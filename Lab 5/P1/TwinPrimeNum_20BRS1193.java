// package twinprimepackage;
import primepackage.*;
public class TwinPrimeNum_20BRS1193 {

    public void checkForTwinPrime(int a, int b){
        PrimeNum_20BRS1193 p1 = new PrimeNum_20BRS1193();
        boolean prev2 = p1.checkForPrime(a);
        boolean prev = p1.checkForPrime(a + 1);
        for(int i = a+2; i <= b; i++){
            boolean cur = p1.checkForPrime(i);
            if(cur && prev2){
                System.out.print("(" + (i-2) + " " +  i + "),");
            }
            prev2 = prev;
            prev = cur;
        }
    }
    public static void main(String args[]){
        TwinPrimeNum_20BRS1193 t1 = new TwinPrimeNum_20BRS1193();
        t1.checkForTwinPrime(1, 20);
    }
}
