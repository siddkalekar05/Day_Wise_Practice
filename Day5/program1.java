class Person {
        private String name;
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        private int age ;
        public int getAge() {
                return age;
        }
        public void setAge(int age) {
                this.age = age;
        }

        void display(){
                System.out.println("Name : "+name);
                System.out.println("Age : "+age);
        }

        public static void main(String[] args) {
                Person p = new Person();
                p.setName("Siddhesh");
                p.setAge(21);

                p.display();
        }
}


