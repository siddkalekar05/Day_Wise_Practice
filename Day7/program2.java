/*
Problem:
Demonstrate multilevel inheritance.
        */

class GrandParent1 {
        void display(){
                System.out.println("GrandParent class Method");
        } 
}
class Parent1 extends GrandParent1 {
        void show(){
                System.out.println("Parent class Method");
        }
}
class Child1 extends Parent1{
        void show1(){
                System.out.println("Child class Method");
        }
        public static void main(String[] args) {
                Child1 c = new Child1();
                c.display();;
                c.show();
                c.show1();   
        }
}
