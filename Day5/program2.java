class ReadOnlyAccount {
        private int balance;
        ReadOnlyAccount(int balance){
                this.balance = balance;
        }
        public int getBalance() {
                return balance;
        }
        public static void main(String[] args) {
                ReadOnlyAccount r = new ReadOnlyAccount(50000);
                System.out.println("Balance : "+r.getBalance());
        }
        
}


