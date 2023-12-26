package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW",5, "Black", "auto"));
        cars.add(new Car("OPEL",8, "White", "auto"));
        cars.add(new Car("TESLA",3, "Green", "mechanics"));
        cars.add(new Car("KIA",6, "Red", "auto"));
        cars.add(new Car("UAZ",8, "Grey", "mechanics"));
    }

    @Override
    public List<Car> limit(int a) {
        return cars.stream().limit(a).collect(Collectors.toList());
    }
}
