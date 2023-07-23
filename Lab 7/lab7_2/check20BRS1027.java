public class check20BRS1027 {
    public static void main(String args[]) {
        check ob1 = new check();
        try {
            ob1.validate(ob1.regno);
        } catch (Exception x) {
            System.out.println(x);
        } finally {
            if (ob1.flag == 0) {
                System.out.println("valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
