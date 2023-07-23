import java.util.regex.*;  
import java.util.NoSuchElementException;

class Student_20BRS1193{
    String reg_no;
    String mobile_no;

    Student_20BRS1193(String reg_no, String mobile_no){
        validate(reg_no, mobile_no);
        System.out.println("Valid");
        this.reg_no = reg_no;
        this.mobile_no = mobile_no;
   }
    private void validate(String reg_no, String mobile_no){
        if(reg_no.length() != 9)
            throw new IllegalArgumentException("Invalid.\nRegistration number does not contain 9 characters");
        if(mobile_no.length() != 10)
            throw new IllegalArgumentException("Invalid.\nMobile number does not contain 10 characters");
        if(!isNumeric(mobile_no))
            throw new NumberFormatException("Invalid - Not Numeric. \n");
        if(!isAlphaNumeric(reg_no))
            throw new NoSuchElementException("Invalid - Not Alphanumeric. \n");
    }
    private Pattern patternNumeric = Pattern.compile("-?\\d+(\\.\\d+)?");

    private boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false; 
        }
        return patternNumeric.matcher(strNum).matches();
    }

    private Pattern patternAlphaNumeric = Pattern.compile("^[a-zA-Z0-9]+$");

    private boolean isAlphaNumeric(String strNum) {
        if (strNum == null) {
            return false; 
        }
        return patternAlphaNumeric.matcher(strNum).matches();
    }

    public static void main(String [] args){
        Student_20BRS1193 s1 = new Student_20BRS1193("abcd12345", "0123456789");
        Student_20BRS1193 s2 = new Student_20BRS1193("abcd12345", "012345678"); // Mobile no doesn't have 10 characters
        Student_20BRS1193 s3 = new Student_20BRS1193("abcd1234", "0123456789"); // Reg no doesn't have 9 characters
        Student_20BRS1193 s4 = new Student_20BRS1193("abcd1234_", "0123456789"); // Reg no has illegal character
        Student_20BRS1193 s5 = new Student_20BRS1193("abcd12345", "012345678w"); // Mobile no has illegal character
    }
}