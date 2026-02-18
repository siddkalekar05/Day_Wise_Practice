class Printer {
    static synchronized void print() {
        System.out.println(Thread.currentThread().getName());
    }
}

class StaticSyncDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(Printer::print);
        Thread t2 = new Thread(Printer::print);

        t1.start();
        t2.start();
    }
}
