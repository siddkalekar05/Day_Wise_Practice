class Demo1 {
        void display(){
                System.out.println("Parent class Method");
        } 
}
class Demo2 extends Demo1 {
        void show(){
                System.out.println("Child class Method");
        }
}
class Client1{
        public static void main(String[] args) {
                Demo2 d = new Demo2();
                d.display();;
                d.show();
        }
}

