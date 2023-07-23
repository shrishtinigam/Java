class Produce_Consume_20BRS1193{
	int i;
	synchronized void Produce(int i) {
		this.i = i; System.out.println("Data Delivered: " +i);
	}
	synchronized int Consume() {
		System.out.println("Data Received: " + i);
		return i;
	}
}

