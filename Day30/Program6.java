/*
Problem:
Simulate centralized exception handling.

Concept:
Handle exceptions at one place.
*/

class ExcpDemo6 {

    static void process() {
        int result = 10 / 0;
    }

    public static void main(String[] args) {

        try {
            process();
        } catch (Exception e) {

            System.out.println("Global Handler:");
            System.out.println("Error Type: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
    }
}
