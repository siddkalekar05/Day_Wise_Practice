class Encapsulation {
        public int balance;
        
        public static void main(String[] args) {
                Encapsulation e = new Encapsulation();
                e.balance = -500;  //Invalid but allowed
                System.out.println("Balance : "+e.balance); 
        }
       
}


