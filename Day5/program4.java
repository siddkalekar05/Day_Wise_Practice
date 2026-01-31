class validation {
        private int age;

        public void setAge(int age) {
                if(age>0&&age<=120){
                        this.age = age;
                }else{
                        System.out.println("Invalid age");
                }
        }
        public int age(){
                return age;
        }
        public static void main(String[] args) {
                validation v = new validation();
                v.setAge(25);
                System.out.println(v.age());

                v.setAge(-1);
        }
       
}


