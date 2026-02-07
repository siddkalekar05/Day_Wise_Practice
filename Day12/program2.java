class FoodDeliveryRating {

    static int parseRating(String ratingInput) {
        return Integer.parseInt(ratingInput);
    }

    public static void main(String[] args) {
        try {
            int rating = parseRating("five");
            System.out.println("Rating: " + rating);
        } catch (NumberFormatException e) {
            System.out.println("Invalid rating format!");
        }
    }
}

