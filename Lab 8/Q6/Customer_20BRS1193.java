public class Customer_20BRS1193 extends Thread{

    int orderNumber = 1;
 
    static int N;
 
    public void table1()
    {
        synchronized (this)
        {
			while (orderNumber < N) {
				while ((orderNumber < 6)) {
					System.out.println("here 1.");
                    
						try {
							wait();
						}
						catch (InterruptedException e) {
							e.printStackTrace();
						}
	
					System.out.println("Order Number: " + orderNumber + " is received by table 1.");
					orderNumber++;
					notifyAll();
				}
			}
        }
    }
 
    public void table2()
    {
        synchronized (this)
        {
			while (orderNumber < N) {
				while ((orderNumber < 11 && orderNumber >= 6)) {
					System.out.println("here 2.");

						try {
							wait();
						}
						catch (InterruptedException e) {
							e.printStackTrace();
						}
	
					System.out.println("Order Number: " + orderNumber + " is received by table 2.");
					orderNumber++;
					notifyAll();
				}
            }
        }
    }

	public void table3()
    {
        synchronized (this)
        {
			while (orderNumber < N) {
				while ((orderNumber < 16 && orderNumber >= 11)) {
					System.out.println("here 3.");

						try {
							wait();
						}
						catch (InterruptedException e) {
							e.printStackTrace();
						}
	
					System.out.println("Order Number: " + orderNumber + " is received by table 3.");
					orderNumber++;
					notifyAll();
				}
			}
        }
    }

	public void table4()
    {
        synchronized (this)
        {
			while (orderNumber < N) {
				while ((orderNumber < 21 && orderNumber >= 16)) {
					System.out.println("here 4.");

						try {
							wait();
						}
						catch (
							InterruptedException e) {
							e.printStackTrace();
						}
	
					System.out.println("Order Number: " + orderNumber + " is received by table 4.");
					orderNumber++;
					notifyAll();
				}
			}
        }
    }
 
    public static void main(String[] args)
    {
        N = 20;
        Customer_20BRS1193 Orders = new Customer_20BRS1193();
 
        Thread t1 = new Thread(new Thread() {
            public void run()
            {
                System.out.println("here 17.");
                Orders.table1();
            }
        });
 
        Thread t2 = new Thread(new Thread() {
            public void run()
            {
                System.out.println("here 18.");
                Orders.table2();
            }
        });
		Thread t3 = new Thread(new Thread() {
            public void run()
            {
                Orders.table3();
            }
        });
 
        Thread t4 = new Thread(new Thread() {
            public void run()
            {
                Orders.table4();
            }
        });
 
	    System.out.println("here 12.");
        t1.start();
		System.out.println("here 13.");
        t2.start();
        System.out.println("here 14.");
        //t3.start();
        System.out.println("here 15.");
        //t4.start();
    }
}
