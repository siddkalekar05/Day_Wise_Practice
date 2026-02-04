interface College {
    void student();
}

class Department implements College {
    public void student() {
        System.out.println("Take an addmission");
    }

    public static void main(String[] args) {
        College c = new Department();
        c.student();
    }
}
