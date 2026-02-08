class ThisDemo {
    private String name ;
    private int a;
    ThisDemo(String name , int a){
        this.name = name;
        this.a = a;
    }
    void print(){
        System.out.println("String value : ");
        System.out.println("Integer value : "+a);
    }
    public static void main(String[] args) {
        ThisDemo d = new ThisDemo("Sidd", 45);
        d.print();
    }
}

