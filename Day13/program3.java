class Device {
    static String a = "Oneplus11R";
}
class Device2 extends Device{
    static String b = "Asus Tuf F15";
    void display(){
        System.out.println("Mobile phone brand : "+super.a);
        System.out.println("Laptop brand : "+b);
       
    }
}
class Client1{
    public static void main(String[] args) {
        Device2 d = new Device2();
        d.display();
        
    }
}

