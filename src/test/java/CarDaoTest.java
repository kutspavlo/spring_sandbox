import spring.practice.models.Car;
import spring.practice.dao.CarDAO;

import java.util.ArrayList;
import java.util.List;

public class CarDaoTest implements CarDAO {
    private ArrayList<Car> cars;
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
