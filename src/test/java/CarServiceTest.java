import spring.practice.models.Car;

public class CarServiceTest {
    private CarDaoTest carDaoTest;

    public CarServiceTest(CarDaoTest carDaoTest) {
        this.carDaoTest = carDaoTest;
    }

   public void addCar(Car car) {
        carDaoTest.createCar(car);
        System.out.println("Created Car: " + car);
   }

}
