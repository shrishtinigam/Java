class ConsumeThread_Table1_20BRS1193 extends Thread {
	Produce_Consume_20BRS1193 obj;
	ConsumeThread_Table1_20BRS1193(Produce_Consume_20BRS1193 obj){ this.obj = obj; }
	public void run() 
	{ 
		for(int k = 1; k <= 5; k++) 
			obj.Consume(k, 1); 
	}
}