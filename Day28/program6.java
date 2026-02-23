/*
Concept:
Custom Runtime Exception
*/
class ExcpDemo6 {

    static void check() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Logging error...");
            throw e; // rethrowing
        }
    }

    public static void main(String[] args) {
        try {
            check();
        } catch (Exception e) {
            System.out.println("Handled in main");
        }
    }
}
