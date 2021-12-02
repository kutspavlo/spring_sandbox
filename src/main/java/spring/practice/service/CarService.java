package spring.practice.service;

import spring.practice.dao.CarDaoJPA;
import spring.practice.models.Car;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class CarService {
    private CarDaoJPA carDaoJPA;

    public CarService(CarDaoJPA carDaoJPA) {
        this.carDaoJPA = carDaoJPA;
    }

    public void addCar(Car car) {
        carDaoJPA.createCar(car);
        Path file = Paths.get("email.txt");
        String entry = car.toString();
        try {
            Files.write(file, Collections.singleton(entry), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
