import java.io.*;
import java.util.regex.*;  
public class UserMade_20BRS1193 {

    private static Pattern patternNumeric = Pattern.compile("-?\\d+(\\.\\d+)?");

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false; 
        }
        return patternNumeric.matcher(strNum).matches();
    }
    public static void main(String [] args){
       
        int x = 0;
        int y = 10;
        if(x == 0)
            throw new ArithmeticException("Dividing by zero is not permitted.");
        int z = y/x;

        String str = null;
        if(str == null)
            throw new NullPointerException("Manipulation of null value is not correct.");
        System.out.println(str.length());

        String str2 = "85784702sds";
        if(!isNumeric(str2))
            throw new NumberFormatException("Input string contains non-numeric data");
    }
}
