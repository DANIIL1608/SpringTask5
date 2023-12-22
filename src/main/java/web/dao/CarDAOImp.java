package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAOImp implements CarDAO{
    private List<Car> carsList = new ArrayList<>();

    {
        carsList.add(new Car(1976, "VAZ 2106", "White"));
        carsList.add(new Car(2000, "VAZ 21099", "Green"));
        carsList.add(new Car(2012, "VAZ 2114", "Silver"));
        carsList.add(new Car(1987, "VAZ 2111", "Red"));
        carsList.add(new Car(2010, "LADA PRIORA", "Grey"));
    }

    public List<Car> getCarsList(int count) {
        List<Car> newCarList = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            newCarList.add(carsList.get(i));
        }
        return newCarList;
    }
}
