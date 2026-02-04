interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class AllInOneMachine implements Printer, Scanner {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }

    public static void main(String[] args) {
        AllInOneMachine m = new AllInOneMachine();
        m.print();
        m.scan();
    }
}
