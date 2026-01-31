/* Problem : 
                Working of write only class where private variables and set method is allowed we cannot get or 
                show the info 
                */

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


