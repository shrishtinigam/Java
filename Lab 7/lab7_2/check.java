import java.util.*;
import java.io.*;

class check {
    public String regno;
    public int flag = 0;
    public String phno;

    check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the regno");
        regno = sc.next();
        System.out.println("Enter your phone number");
        phno = sc.next();
    }

    public void validate(String regno) {
        // System.out.println("Length"+regno.length());
        if (regno.length() != 9) {
            flag = 1;
            throw new IllegalArgumentException("Registration number does not contain 9 characters");
        }
        if (phno.length() != 10) {
            flag = 1;
            throw new IllegalArgumentException("Mobile number does contain 10 digits");
        }
        for (int i = 0; i < phno.length(); i++) {
            if (phno.charAt(i) < '0' || phno.charAt(i) > '9') {
                throw new NumberFormatException();
            }
        }
        for (int i = 0; i < regno.length(); i++) {
            if ((Character.isLetterOrDigit(regno.charAt(i)) == false)) {
                throw new NoSuchElementException();
            }
        }
    }
}