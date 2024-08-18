package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Focus", 2018));
        cars.add(new Car("Chevrolet", "Cruze", 2017));
        cars.add(new Car("Nissan", "Sentra", 2021));
    }

    public List<Car> getCars(int numberOfCars) {
        if (numberOfCars > cars.size()) {
            return new ArrayList<>(cars);
        }
        return cars.subList(0, numberOfCars);
    }
}
