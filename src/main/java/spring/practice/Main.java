package spring.practice;

import spring.practice.dao.CarDaoJDBC;
import spring.practice.dao.CarDaoJPA;
import spring.practice.models.Car;
import spring.practice.service.CarService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
//        JDBC implementation test
//
//        CarDaoJDBC carDaoJDBC = new CarDaoJDBC();
//        List<Car> cars = carDaoJDBC.getAll();
//        cars.forEach(System.out::println);
//
//        Car car = new Car("Ford", (short) 1992, "white");
//        carDaoJDBC.createCar(car);
//
//          JPA implementation test
//
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Car");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        CarDaoJPA carDaoJPA = new CarDaoJPA(entityManager);
//        List<Car> cars = carDaoJPA.getAll();
//        cars.forEach(System.out::println);
//        carDaoJPA.deleteCar(cars.get(0));
//
//        Car car = new Car("Tesla", 2020, "black");
//        carDaoJPA.createCar(car);

//       CarService (manually injection of CarDaoJPA)
         Car car = new Car("BMW", 2014, "red");
         EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Car");
         EntityManager entityManager = entityManagerFactory.createEntityManager();
         CarDaoJPA carDaoJPA = new CarDaoJPA(entityManager);
         CarService carService = new CarService(carDaoJPA);
         carService.addCar(car);

    }
}
