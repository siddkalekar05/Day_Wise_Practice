class WriteOnlyPass {
        private String passward;

        public void setPassward(String passward) {
                this.passward = passward;
                System.out.println("Password set Successfully");
        }
        public static void main(String[] args) {
                WriteOnlyPass w = new WriteOnlyPass();
                w.setPassward("Siddhesh0901");
                //System.out.println(w.passward);     Not allowed
        }     
}


