class thread1_20BRS1193 extends Thread {
    Table_20BRS1193 m;

    thread1_20BRS1193(Table_20BRS1193 m) {
        this.m = m;
    }

    public void run() {
        m.table(2);
    }
}
