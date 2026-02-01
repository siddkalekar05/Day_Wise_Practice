 class Praent{
        Praent(){
                System.out.println("Parent Constructor");
        }
}
class Child extends Praent{
        Child(){
                System.out.println("Child Constructor");
        }

        public static void main(String[] args) {
                Child c = new Child();
        }
}
