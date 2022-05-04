

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;


public class RentalInfo {
    /**
     * @param customer
     * @return result
     */
    //method returns rental receipt for each customer
    String statement(@NotNull Customer customer) {

        HashMap<MovieId, Movie> movies = new HashMap();
        movies.put(MovieId.F001, new Movie("You've Got Mail", MovieCode.REGULAR));
        movies.put(MovieId.F002, new Movie("Matrix", MovieCode.REGULAR));
        movies.put(MovieId.F003, new Movie("Cars", MovieCode.CHILDREN));
        movies.put(MovieId.F004, new Movie("Fast & Furious X", MovieCode.NEW));

        double totalAmount = 0.0;
        int frequentEnterPoints = 0;

        String result = "Rental Record for " + customer.getName() + "\n";
        for (MovieRental r : customer.getRentals()) {
            double baseAmount = 0.0;
            var movieCode = movies.get(r.getMovieId()).getCode().strip();

            switch (movieCode) {
                case "REGULAR":
                    baseAmount = 2;
                    if (r.getDays() > 2)
                        baseAmount = ((r.getDays() - 2) * 1.5) + baseAmount;
                    break;

                case "NEW":
                    baseAmount = r.getDays() * 3;
                    if (r.getDays() > 2)
                        frequentEnterPoints++; // add bonus for a two day new release rental
                    break;

                case "CHILDREN":
                    baseAmount = 1.5;
                    if (r.getDays() > 3)
                        baseAmount = ((r.getDays() - 3) * 1.5) + baseAmount;
                    break;


            }

            //add frequent bonus points
            frequentEnterPoints++;

            //print figures for this rental
            result += "\t" + movies.get(r.getMovieId()).getTitle() + "\t" + baseAmount + "\n";
            totalAmount += baseAmount;
        }
        // add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentEnterPoints + " frequent points\n";

        return result;
    }
}