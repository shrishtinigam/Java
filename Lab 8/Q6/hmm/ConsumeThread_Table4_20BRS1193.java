class ConsumeThread_Table4_20BRS1193 extends Thread {
	Produce_Consume_20BRS1193 obj;
	ConsumeThread_Table4_20BRS1193(Produce_Consume_20BRS1193 obj){ this.obj = obj; }
	public void run() { for(int k = 15; k <= 20; k++) obj.Consume(k, 4); }
}