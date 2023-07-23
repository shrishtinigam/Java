public class Railway_20BRS1193 {
    
    String name;
    short age;
    int seatNo;
    int trainNo;
    boolean freedomFighter;
    String source;
    String destination;
    int ticketFare;

    Railway_20BRS1193(String name, short age, int seatNo, int trainNo, boolean freedomFighter, String source, String destination){
        
        this.name = name;
        this.age = age;
        this.seatNo = seatNo;
        this.trainNo = trainNo;
        this.freedomFighter = freedomFighter;
        this.source = source;
        this.destination = destination;

        String [][] fares = { {"Chennai", "Mumbai", "500"},
        {"Chennai", "Delhi", "800"},
        {"Chennai", "Kolkata", "700"},
        {"Delhi", "Mumbai", "800"},
        {"Delhi", "Kolkata", "700"},
        {"Mumbai", "Kolkata", "800"}
        };

        for(int i = 0; i < fares.length; i++)
            if(source == fares[i][0] && destination == fares[i][1])
                this.ticketFare = Integer.parseInt(fares[i][2]);
        
        if(freedomFighter)
            this.ticketFare /= 2;
        
    }

    public void displayTicket(){
        System.out.println("Name: " + name);
        System.out.println("Seat No: " + seatNo);
        System.out.println("Train No: " + trainNo);
        System.out.println("Freedom Fighter: " + freedomFighter);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Fare: " + ticketFare);
        System.out.println("");
    }

    public static void main(String args[]){
        Railway_20BRS1193 t1 = new Railway_20BRS1193("Meher", (short)20, 23442, 849340, false, "Chennai", "Mumbai");
        t1.displayTicket();
        Railway_20BRS1193 t2 = new Railway_20BRS1193("Rajesh", (short)45, 23443, 849340, true, "Chennai", "Mumbai");
        t2.displayTicket();
        Railway_20BRS1193 t3 = new Railway_20BRS1193("Rohan", (short)34, 59849, 849334, false, "Delhi", "Mumbai");
        t3.displayTicket();
        Railway_20BRS1193 t4 = new Railway_20BRS1193("John", (short)75, 594392, 849434, true, "Delhi", "Mumbai");
        t4.displayTicket();
    }
}
