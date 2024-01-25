package pl.pjatk.Wypozyczalnia;

import org.springframework.stereotype.Component;

import java.util.List;


public class CarService {
    private final CarStorage carStorage;
    private final RentalStorage rentalStorage;

    public CarService(CarStorage carStorage, RentalStorage rentalStorage) {
        this.carStorage = carStorage;
        this.rentalStorage = rentalStorage;
    }

    public void ShowAvailableCarList() {
        for (Car car : carStorage.getCars()) {
            if (car.isAvailable()) {
                car.getInfoCar();
            }
        }
    }

    public void ShowAllRental() {
        for (Rental rental : rentalStorage.getRentals()) {
            System.out.println(rental.toString());
        }
    }

    public void rentCar(User user, String vin) {
        if (findVin(vin) == null) {
            return;
        }
        if (!findVin(vin).isAvailable()) {
            return;
        }
        rentalStorage.getRentals().add(new Rental(user, findVin(vin)));
        findVin(vin).setAvailable(false);
        System.out.println("Chwilowo brak, samochód wypożyczono");
    }

    public Car findVin(String vin) {
        for (Car car : carStorage.getCars()) {
            if (car.getVin().equals(vin)) {
                return car;
            }
        }
        return null;
    }
}
