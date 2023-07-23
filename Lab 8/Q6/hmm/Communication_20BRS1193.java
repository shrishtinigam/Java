class Communication_20BRS1193 {
	public static void main(String[] args) {
		Produce_Consume_20BRS1193 obj = new Produce_Consume_20BRS1193();
		ProduceThread_20BRS1193 P = new ProduceThread_20BRS1193(obj);
		P.start();
		ConsumeThread_Table1_20BRS1193 C1 = new ConsumeThread_Table1_20BRS1193(obj);
		C1.start();
		ConsumeThread_Table2_20BRS1193 C2 = new ConsumeThread_Table2_20BRS1193(obj);
		C2.start();
		ConsumeThread_Table3_20BRS1193 C3 = new ConsumeThread_Table3_20BRS1193(obj);
		C3.start();
		ConsumeThread_Table4_20BRS1193 C4 = new ConsumeThread_Table4_20BRS1193(obj);
		C4.start();
	}
}