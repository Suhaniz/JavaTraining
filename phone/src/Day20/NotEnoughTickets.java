package Day20;

// Step 1: Creating a Custom Exception
public class NotEnoughTickets extends Exception {
    public NotEnoughTickets(String message) {
        super(message);
    }
}

// Step 2: Movie Theater Class with Ticket Booking Method
class MovieTheater {
    private int availableSeats;

    public MovieTheater(int seats) {
        this.availableSeats = seats;
    }

    // Method to book tickets
    public void bookTicket(int tickets) throws NotEnoughTickets {
        if (tickets > availableSeats) {
            throw new NotEnoughTickets("Not Enough Seats Available. Only " + availableSeats + " left.");
        }

        availableSeats -= tickets;
        System.out.println("Booking Successful! Remaining Seats: " + availableSeats);
    }

    // Main method to test booking
    public static void main(String[] args) {
        MovieTheater mt = new MovieTheater(5);

        try {
            mt.bookTicket(3);  // Successful
            mt.bookTicket(4);  // Should throw exception
        } catch (NotEnoughTickets e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }
    }
}
