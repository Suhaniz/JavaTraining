package Day20;

public class TicketBooking {
    // Step 3: Testing the Exception Handling
    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater(5); // Only 5 Seats available

        try {
            theater.bookTicket(7); // Trying to book 7 tickets
        } catch (NotEnoughTickets e) {
            System.out.println("Booking Failed: " + e.getMessage());
        } finally {
            System.out.println("Thank You for using our Service!");
        }
    }
}
