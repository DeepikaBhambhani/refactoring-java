

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Customer {
    @NotNull
    private String name;

    @NotNull
    private List<MovieRental> rentals;

    public Customer(String name, List<MovieRental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return rentals
     */
    public List<MovieRental> getRentals() {
        return rentals;
    }
}