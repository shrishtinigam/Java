class ProduceThread_20BRS1193 extends Thread{
	Produce_Consume_20BRS1193 obj;
	ProduceThread_20BRS1193(Produce_Consume_20BRS1193 obj){ 
		this.obj = obj; 
	}
	public void run() {
		for(int k = 0; k <= 5; k++) 
		obj.Produce(k);
	}
}