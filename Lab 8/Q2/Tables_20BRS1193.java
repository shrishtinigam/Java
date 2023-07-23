class Tables_20BRS1193 extends Thread { // Extend Thread
	public void twosTable() {
		for (int i = 1; i <= 10; i++)
			System.out.println("2 x " + i + " = " + (2 * i));
		System.out.println();
	}

	public void threesTable() {
		for (int i = 1; i <= 10; i++)
			System.out.println("3 x " + i + " = " + (3 * i));
		System.out.println();
	}

	public void fivesTable() {
		for (int i = 1; i <= 10; i++)
			System.out.println("5 x " + i + " = " + (5 * i));
		System.out.println();
	}

	public static void main(String[] args) {
		Tables_20BRS1193 Thd1 = new Tables_20BRS1193();
		Thd1.twosTable();
		Tables_20BRS1193 Thd2 = new Tables_20BRS1193();
		Thd2.threesTable();
		Tables_20BRS1193 Thd3 = new Tables_20BRS1193();
		Thd3.fivesTable();
	}
}
