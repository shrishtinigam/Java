public class TechnicalWeek_20BRS1193 {
    final static int WORKSHOP_COST = 100;
    final static int POSTER_COST = 200;
    final static int HACKATHON_COST = 300;
    static int workshopCount = 0;
    static int posterCount = 0;
    static int hackathonCount = 0;
    int regNo;
    int totalCost;

    public void run(Boolean workshop, Boolean poster, Boolean hackathon){
        if(workshop)
            this.Workshop();
        if(poster)
            this.Poster();
        if(hackathon)
            this.Hackathon();
        this.print();
    }

    void Workshop(){
        this.totalCost += WORKSHOP_COST;
        workshopCount++;
    }
    void Poster(){
        this.totalCost += POSTER_COST;
        posterCount++;
    }
    void Hackathon(){
        this.totalCost += HACKATHON_COST;
        hackathonCount++;
    }

    public void print(){
        System.out.println("Total Cost to be payed by current student:" + this.totalCost);
        System.out.println("Number of students for workshop:" + workshopCount);
        System.out.println("Number of students for poster presentation:" + posterCount);
        System.out.println("Number of students for hackathon:" + hackathonCount);
        int totalFunds = (workshopCount * WORKSHOP_COST) + (posterCount * POSTER_COST) + (hackathonCount * HACKATHON_COST);
        System.out.println("Total funds:" + totalFunds);
        System.out.println();
    }
    public static void main(String args[]){
        TechnicalWeek_20BRS1193 stu1 = new TechnicalWeek_20BRS1193();
        stu1.run(true, true, false);
        TechnicalWeek_20BRS1193 stu2 = new TechnicalWeek_20BRS1193();
        stu2.run(false, true, true);
        TechnicalWeek_20BRS1193 stu3 = new TechnicalWeek_20BRS1193();
        stu3.run(true, false, false);
        TechnicalWeek_20BRS1193 stu4 = new TechnicalWeek_20BRS1193();
        stu4.run(false, false, false);
        TechnicalWeek_20BRS1193 stu5 = new TechnicalWeek_20BRS1193();
        stu5.run(true, true, true);
    }
}