/*Problem : 
        Basic implementation of encapsulation using acoount balance
        We can change the value of public variables 
        */

class Encapsulation {

        public int balance;
        
        public static void main(String[] args) {
                Encapsulation e = new Encapsulation();
                e.balance = -500;  //Invalid but allowed
                System.out.println("Balance : "+e.balance); 
        }
       
}


