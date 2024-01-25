package pl.pjatk.Wypozyczalnia;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RentalStorage {
    private List<Rental> rentals = new ArrayList<>();

    public RentalStorage() {
        rentals.add(new Rental(new User("1"), new Car("VW", "Polo", "Standard", "AAAAAAXCR18273939")));
        rentals.add(new Rental(new User("2"), new Car("Mercedes", "Maybach", "Platinium", "GARCAGXCR18273939")));
    }

    public List<Rental> getRentals() {
        return rentals;
    }
    public void addRental(Rental rental) { rentals.add(rental); }
}
