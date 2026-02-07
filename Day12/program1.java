/*
Scenario:
Booking movie tickets using a function.

Concept:
Exception handling with method arguments.
*/

class TicketBooking {

    static void bookTickets(int availableSeats, int requestedSeats) throws Exception {
        if (requestedSeats > availableSeats) {
            throw new Exception("Not enough seats available!");
        }
        System.out.println("Booking successful");
    }

    public static void main(String[] args) {
        try {
            bookTickets(5, 10);
        } catch (Exception e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}
