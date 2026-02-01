/*
Problem:
Demonstrate constructor chaining using this().
        */

class ConstructorChaining {
        int a;
        int b;
        ConstructorChaining(){
                this(12,13);
                System.out.println("Default Constructor called");
        }
        ConstructorChaining(int a, int b){
                this.a = a;
                this.b = b;
                System.out.println("Parameterized Consructor");
        }
        
        void display(){
                System.out.println("a : "+a);
                System.out.println("b : "+b);
        }
      
        public static void main(String[] args) {
                ConstructorChaining c1 = new ConstructorChaining();
                c1.display();
        }
}

