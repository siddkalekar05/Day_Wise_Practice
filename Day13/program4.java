/*
Day 13 — Java Keywords

Program:
static variable example

Concept:
static variable shared among all objects.
*/

class Count1 {
    static int a = 10;
    Count1(){
        a++;
    }
    void display(){
        System.out.println("Value inc a : "+ a);
    }
}
class Client1{
    public static void main(String[] args) {
       Count1 c;
       c = new Count1();
       c = new Count1();
       c = new Count1();
       c = new Count1();
       c.display();  
    }
}

