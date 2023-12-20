package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Component
public class CarService {
    private CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> getCarsList(int count) {
        return carDAO.getCarsList(count);
    }
}
