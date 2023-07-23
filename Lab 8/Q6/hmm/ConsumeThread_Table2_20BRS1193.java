class ConsumeThread_Table2_20BRS1193 extends Thread {
	Produce_Consume_20BRS1193 obj;
	ConsumeThread_Table2_20BRS1193(Produce_Consume_20BRS1193 obj){ this.obj = obj; }
	public void run() { for(int k = 6; k <= 10; k++) obj.Consume(k, 2); }
}