package unitTest;

import org.checkerframework.checker.units.qual.C;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.practice.models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("unitTest")
public class Config {


    @Bean
    public ArrayList<Car> cars(){
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford", 1993, "red"));
        cars.add(new Car("Tesla", 2021, "white"));
        cars.add(new Car("Fiat", 2003, "black"));
        return cars;
    }

}
