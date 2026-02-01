class Demo2 {
        int a;
        int b;
      Demo2(int a , int b){
        this.a = a;
        this.b = b;
      }
      void display(){
        System.out.println("Value of 1 st parameter : "+a);
        System.out.println("Value of parameter 2 : "+b);
      }
        public static void main(String[] args) {
                Demo2 obj = new Demo2(45, 18);    
        }
}

