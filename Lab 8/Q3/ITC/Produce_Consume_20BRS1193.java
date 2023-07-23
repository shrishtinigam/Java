class Produce_Consume_20BRS1193{
	int i;
	boolean flag = false;
	synchronized void Produce(int i) {
	    if(flag)
		    try { // Wait till a notification is received from Thread2.
	            wait();
	        }
	        catch(InterruptedException ie) { 
                System.out.println(ie);
            }
        this.i = i;
		System.out.println("Data Delivered: " +i);
		flag = true; // When data production is over.
		notify(); // Notification to Thread2, when data Produced.
	}
	synchronized int Consume() {
	if(!flag)
		try { // Wait till a notification is received from Thread1.
	        wait();
        }
        catch(InterruptedException ie){ 
            System.out.println(ie); 
        }
        System.out.println("Data Received: " + i);
        flag = false; // When data is received.
        notify(); //Notification to Thread1, when data Consumed.
        return i;
    }
}

