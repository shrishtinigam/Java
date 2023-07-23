import java.util.Scanner;
class StudentDetails_20BRS1193 {

    int [] marks;
    
    StudentDetails_20BRS1193(){
        this.marks = getMarks();
    }
    
    int [] getMarks(){
       
        System.out.println("How many courses do you have?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] marks = new int [n]; 
        for(int i = 0; i < n; i++){
            System.out.print("Course " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }
        return marks;
    }
}