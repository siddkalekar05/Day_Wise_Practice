/*
Day 13 — Java Keywords

Program:
final variable example

Concept:
final variable cannot be modified.
*/

class Count3 {
    static int a = 5;
    //static final  int a = 10;  this occures error bcz final keyword prevents changes 
    Count3(){
        a++;
    }
    void display(){
        System.out.println("Value inc a : "+ a);
    }
}
class Client5{
    public static void main(String[] args) {
       Count3 c;
       c = new Count3();
       c = new Count3();
       c = new Count3();
       c = new Count3();
       c.display();  
    }
}

