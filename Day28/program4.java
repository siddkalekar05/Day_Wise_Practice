/*
Concept:
Auto-closing resources (Java 7+)
*/
class ExcpDemo4 {
    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Handled multiple exception types");
        }
    }
}
