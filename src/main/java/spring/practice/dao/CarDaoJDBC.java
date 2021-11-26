package spring.practice.dao;

import org.springframework.stereotype.Component;
import spring.practice.models.Car;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component("CarDaoJDBC")
public class CarDaoJDBC implements CarDAO {

    private static final String dbURL = "jdbc:postgresql://localhost:5433/first_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "rewfds";

    private static Connection connection;

    public CarDaoJDBC() {
    }

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(dbURL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Car> getAll() {
        List<Car> cars = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM car";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                Car car = new Car();
                car.setId(resultSet.getString("uuid"));
                car.setModel(resultSet.getString("model"));
                car.setYear(resultSet.getShort("year"));
                car.setColor(resultSet.getString("color"));

                cars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
     return cars;
    }

    @Override
    public void createCar(Car car) {
        try {
            String SQL = "INSERT INTO car (uuid, model, year, color) values (?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, car.getId());
            preparedStatement.setString(2, car.getModel());
            preparedStatement.setShort(3, car.getYear());
            preparedStatement.setString(4,car.getColor());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteCar(Car car) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM car WHERE uuid=?;");
            preparedStatement.setString(1, car.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
