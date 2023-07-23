public class DeliveryOffice_20BRS1193 {

    int parcelNumber = 1;
 
    static int N;
 
    public void customer1()
    {
        synchronized (this)
        {
            while (parcelNumber < N) {
 
                while (parcelNumber % 2 == 0) {
 
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
 
                System.out.println("Parcel Number: " + parcelNumber + " is received by customer 1.");
                parcelNumber++;
                notify();
            }
        }
    }
 
    public void customer2()
    {
        synchronized (this)
        {
            while (parcelNumber < N) {
                while (parcelNumber % 2 == 1) {
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
 
                System.out.println("Parcel Number: " + parcelNumber + " is received by customer 2.");
                parcelNumber++;
                notify();
            }
        }
    }
 
    public static void main(String[] args)
    {
        N = 10;
        DeliveryOffice_20BRS1193 parcels = new DeliveryOffice_20BRS1193();
 
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                parcels.customer2();
            }
        });
 
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                parcels.customer1();
            }
        });
 
        t1.start();
        t2.start();
    }
}