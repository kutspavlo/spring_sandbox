import org.checkerframework.checker.units.qual.C;
import spring.practice.models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", 2008, "black");
        Car car2 = new Car("Tesla", 2020, "white");
        Car car3 = new Car("Fiat", 2017, "red");
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);


        CarDaoTest carDaoTest = new CarDaoTest(cars);

        ArrayList<Car> allCars = carDaoTest.getAll();
        allCars.forEach(System.out::println);

        System.out.println("***************");

        Car newCar = new Car("Volvo", 2021, "silver");
        carDaoTest.createCar(newCar);
        ArrayList<Car> allCarsIncludingNew = carDaoTest.getAll();
        allCarsIncludingNew.forEach(System.out::println);

        System.out.println("***************");

        carDaoTest.deleteCar(newCar);
        ArrayList<Car> allCarsExcludingNew = carDaoTest.getAll();
        allCarsExcludingNew.forEach(System.out::println);
    }
}
