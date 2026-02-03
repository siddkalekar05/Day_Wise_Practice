class BMW {
    void info() {
        System.out.println("Main Company");
    }
}

class M5 extends BMW {
    @Override
    void info() {
        System.out.println("BMW M5 MODEL");
    }
}

class ParentReferenceDemo1 {
    public static void main(String[] args) {
        BMW b = new M5();
        b.info(); // M5 info  method
    }
}
