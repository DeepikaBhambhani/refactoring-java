import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String expected = "Rental Record for C. U. Stoner\n\tYou've Got Mail\t3.5\n\tMatrix\t2.0\nAmount owed is 5.5\nYou earned 2 frequent points\n";

        String result = new RentalInfo().statement(new Customer("C. U. Stoner", Arrays.asList(new MovieRental(MovieId.F001, 3), new MovieRental(MovieId.F002, 1))));

        if (!result.equals(expected)) {
            throw new AssertionError("Expected: " + System.lineSeparator() + String.format(expected) + System.lineSeparator() + System.lineSeparator() + "Got: " + System.lineSeparator() + result);
        }

        System.out.println("Success");
    }
}