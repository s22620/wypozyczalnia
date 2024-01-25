package pl.pjatk.Wypozyczalnia;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarStorage {

    private List<Car> cars = new ArrayList<>();

    public CarStorage() {
        cars.add(new Car("VW", "Polo", "Standard", "AAAAAAXCR18273939"));
        cars.add(new Car("Audi", "A8", "Premium", "BBBBBBXCR18273982"));
        cars.add(new Car("Mercedes", "Maybach", "Platinium", "GARCAGXCR18273939"));
        cars.add(new Car("Ferrari", "Enzo", "Private", "FRTHTPXR894289339"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(Car car){ cars.add(car);}
    }

