/*
Problem:
Understand finally behavior with return.

Concept:
finally always executes.
*/
class ExcpDemo4 {

    static int test() {

        try {
            return 10;
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {

        int result = test();
        System.out.println("Returned: " + result);
    }
}
