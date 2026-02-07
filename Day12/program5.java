class AirportCheckIn {

    static void validatePassport(String passport) throws Exception {
        if (passport.length() < 6) {
            throw new Exception("Invalid passport number");
        }
        System.out.println("Passport verified");
    }

    public static void main(String[] args) {
        try {
            validatePassport("AB12");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
