package pl.pjatk.Wypozyczalnia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class WypozyczalniaApplication {

    private final CarStorage carStorage;

    private final CarService carService;

    public WypozyczalniaApplication(CarStorage carStorage, CarService carService) {
        this.carStorage = carStorage;
        this.carService = carService;
    }

    public static void main(String[] args) {

        SpringApplication.run(WypozyczalniaApplication.class, args);
    }
}
