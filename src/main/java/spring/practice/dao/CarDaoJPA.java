package spring.practice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.practice.models.Car;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

@Repository
public class CarDaoJPA implements CarDAO {
    @Autowired
    private EntityManager entityManager;


    public CarDaoJPA() {

    }

    public CarDaoJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    public List<Car> getAll() {
        List<Car> cars = entityManager.createQuery("SELECT c FROM Car c", Car.class).getResultList();
     return cars;
    }

    @Override
    public void createCar(Car car) {
            entityManager.getTransaction().begin();
            entityManager.persist(car);
            entityManager.getTransaction().commit();
    }


    @Override
    public void deleteCar(Car car) {
        entityManager.getTransaction().begin();
        entityManager.remove(car);
        entityManager.getTransaction().commit();

    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
