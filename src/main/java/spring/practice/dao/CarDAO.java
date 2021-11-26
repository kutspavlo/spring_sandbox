package spring.practice.dao;

import spring.practice.models.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getAll();
    void createCar(Car car);
    void deleteCar(Car car);
}
