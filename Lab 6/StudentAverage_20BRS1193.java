import java.util.stream.*;
class StudentAverage_20BRS1193 extends StudentDetails_20BRS1193{
    
    final int NUM_OF_CREDITS = 3;
    int average;
    int GPA;

    void computeAvg(){
        int sum = IntStream.of(this.marks).sum();
        this.average = sum / marks.length;
    }

    void computeGPA(){
        int creditScoreSum = 0;
        for(int i = 0; i < this.marks.length; i++){
            creditScoreSum += (NUM_OF_CREDITS * this.marks[i]);
        }
        int creditScore = creditScoreSum/(this.marks.length * NUM_OF_CREDITS);
        if(creditScore >= 95){
            this.GPA = 10;
        }else if(creditScore >= 50){
            this.GPA = creditScore / 10;
        }else{
            this.GPA = 0;
        }
    }

    StudentAverage_20BRS1193(){
        super();
        computeAvg();
        computeGPA();
    }

    void display(){
        System.out.println("Marks:");
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println("Average:" + this.average);
        System.out.println("GPA:" + this.GPA);
    }

    public static void main(String args[]){
        StudentAverage_20BRS1193 s1 = new StudentAverage_20BRS1193();
        s1.display();
    }
}
