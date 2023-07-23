class NoCommunication_20BRS1193 {
	public static void main(String[] args) {
		Produce_Consume_20BRS1193 obj = new Produce_Consume_20BRS1193();
		ProduceThread_20BRS1193 P = new ProduceThread_20BRS1193(obj);
		P.start();
		ConsumeThread_20BRS1193 C = new ConsumeThread_20BRS1193(obj);
		C.start();
	}
}