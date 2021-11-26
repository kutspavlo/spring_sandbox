package spring.practice;

import spring.practice.dao.CarDaoJDBC;
import spring.practice.models.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
  //      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = context.getBean("rockMusic", RockMusic.class);
//        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
//
//        MusicPlayer musicPlayer =  new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        MusicPlayer classicalMusicPlayerPlayer = new MusicPlayer(music2);
//        classicalMusicPlayerPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
//
//        context.close();


         CarDaoJDBC carDaoJDBC = new CarDaoJDBC();
         List<Car> cars = carDaoJDBC.getAll();
         carDaoJDBC.deleteCar(cars.get(0));

        Car car = new Car("Ford", (short) 1992, "red");
        carDaoJDBC.createCar(car);

    }
}
