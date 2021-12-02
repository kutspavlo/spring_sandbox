package unitTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.practice.models.Car;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
//        Car car1 = new Car("Ford", 2008, "black");
//        Car car2 = new Car("Tesla", 2020, "white");
//        Car car3 = new Car("Fiat", 2017, "red");
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(car1);
//        cars.add(car2);
//        cars.add(car3);


//        CarDaoTest carDaoTest = new CarDaoTest(cars);
//
//        ArrayList<Car> allCars = carDaoTest.getAll();
//        allCars.forEach(System.out::println);
//
//        System.out.println("***************");
//
//        Car newCar = new Car("Volvo", 2021, "silver");
//        carDaoTest.createCar(newCar);
//        ArrayList<Car> allCarsIncludingNew = carDaoTest.getAll();
//        allCarsIncludingNew.forEach(System.out::println);
//
//        System.out.println("***************");
//
//        carDaoTest.deleteCar(newCar);
//        ArrayList<Car> allCarsExcludingNew = carDaoTest.getAll();
//        allCarsExcludingNew.forEach(System.out::println);

        //CarServiceTest

//        Car car = new Car("Ford", 1987, "brown");
//        CarDaoTest carDaoTest = new CarDaoTest(cars);
//        CarServiceTest carServiceTest = new CarServiceTest(carDaoTest);
//        carServiceTest.addCar(car);
//        cars.forEach(System.out::println);

        //XML Definition

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("testApplicationContext.xml");
//        ArrayList<Car> cars = context.getBean("cars", ArrayList.class);
//        CarServiceTest carServiceTest = context.getBean("carServiceTest", CarServiceTest.class);
//        Car car = new Car("Siat", 2003, "silver");
//        carServiceTest.addCar(car);
//        cars.forEach(System.out::println);

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CarServiceTest carServiceTest = context.getBean(CarServiceTest.class);
        Car car = new Car("Fiat", 2002, "brown");
        carServiceTest.addCar(car);
        ArrayList<Car> cars = context.getBean("cars", ArrayList.class);
        cars.forEach(System.out::println);
    }
}
