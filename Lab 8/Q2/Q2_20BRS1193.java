class Q2_20BRS1193 {
    public static void main(String[] args) {
        Table_20BRS1193 ob = new Table_20BRS1193();
        thread1_20BRS1193 t1 = new thread1_20BRS1193(ob);
        thread2_20BRS1193 t2 = new thread2_20BRS1193(ob);
        thread3_20BRS1193 t3 = new thread3_20BRS1193(ob);
        t1.start();
        t2.start();
        t3.start();
    }
}