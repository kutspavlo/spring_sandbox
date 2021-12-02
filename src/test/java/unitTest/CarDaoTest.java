package unitTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.practice.models.Car;
import spring.practice.dao.CarDAO;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoTest implements CarDAO {
    @Autowired
    private ArrayList<Car> cars;
    public CarDaoTest(){

    }
    public CarDaoTest(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public ArrayList<Car> getAll() {
        return cars;
    }

    @Override
    public void createCar(Car car) {
        cars.add(car);
    }

    @Override
    public void deleteCar(Car car) {
        cars.remove(car);
    }


}
