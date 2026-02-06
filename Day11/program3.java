interface Printer {
    void print();

    default void status() {
        System.out.println("Printer is ready");
    }
}

class LaserPrinter implements Printer {
    public void print() {
        System.out.println("Printing document");
    }

    public static void main(String[] args) {
        LaserPrinter p = new LaserPrinter();
        p.print();
        p.status();
    }
}
