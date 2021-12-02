package unitTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.practice.models.Car;

@Component
public class CarServiceTest {
    @Autowired
    private CarDaoTest carDaoTest;

    public CarServiceTest(){

    }

    public void setCarDaoTest(CarDaoTest carDaoTest) {
        this.carDaoTest = carDaoTest;
    }

    public CarServiceTest(CarDaoTest carDaoTest) {
        this.carDaoTest = carDaoTest;
    }

   public void addCar(Car car) {
        carDaoTest.createCar(car);
        System.out.println("Created Car: " + car);
   }

}
