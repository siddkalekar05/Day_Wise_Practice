/*
Day 13 — Java Keywords

Program:
this keyword example

Concept:
this refers to the current object.

Explanation:
Used to differentiate instance variables from constructor parameters.
*/


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

