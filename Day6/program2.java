/*Problem:
Demonstrate the use of a default & parameterized constructor in Java.
        */

class Demo1 {
        Demo1(){
                System.out.println("Constructor is calleed");
        }
        Demo1(int a){
                System.out.println("Parameterized constructor having paramter as a interger value :  "+a);
        }
        public static void main(String[] args) {
                Demo1 obj1 = new Demo1();
                Demo1 obj2 = new Demo1(12);
        }
}

