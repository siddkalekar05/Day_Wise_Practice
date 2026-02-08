class ThisDemo1 {
    static String name ;
    static int a;
    ThisDemo1(String name , int a){
        this.name = name;
        this.a = a;
    }
    void print(){
        System.out.println("String value : "+name);
        System.out.println("Integer value : "+a);
    }
}
class Demo2 extends ThisDemo1{
    static float b;
    static byte c;
    Demo2(String string, int i, float f, byte d) {
        super(name , a);
        this.print();
        this.b = b;
        this.c = c;
    }
        
    void display(){
        System.out.println("Float "+b);
        System.out.println("Byte : "+c);
    }

}
class Client1{
    public static void main(String[] args) {
        Demo2 d = new Demo2("Sidd",45,7.8f, (byte)7);
        d.display();;


    }
}

