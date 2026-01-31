class Encapsulation2 {
        public int balance;

        public void setBalance(int balance) {
                if(balance>=0){
                        this.balance = balance;
                }else{
                        System.out.println("Invalid amount");
                }
        }
        public int getBalance() {
                return balance;
        }
        public static void main(String[] args) {
                Encapsulation2 e = new Encapsulation2();
                e.setBalance(5000);
                System.out.println("Balnace : "+e.getBalance());

                e.setBalance(-1000);
        }
       
}


