class ConstructorOverloading {
        int a;
        int b;
        ConstructorOverloading(){
                a = 0;
                b = 0;
        }
        ConstructorOverloading(int a){
                this.a = a;
                b = 10;
        }
        ConstructorOverloading(int a,int b){
                this.a = a;
                this.b = b;
        }
        void display(){
                System.out.println("a : "+a);
                System.out.println("b : "+b);
        }
      
        public static void main(String[] args) {
                ConstructorOverloading c1 = new ConstructorOverloading();
                ConstructorOverloading c2 = new ConstructorOverloading(12);
                ConstructorOverloading c3 = new ConstructorOverloading(12, 013);
                c1.display();
                c2.display();
                c3.display(); 
        }
}

