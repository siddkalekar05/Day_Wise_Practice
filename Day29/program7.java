class ExcpDemo7_AvoidExceptionForFlow {

    public static void main(String[] args) {

        String input = "abc";

        // Proper validation before parsing
        if (input.matches("\\d+")) {

            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);

        } else {

            System.out.println("Invalid number format.");
        }
    }
}
