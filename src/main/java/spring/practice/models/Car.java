package spring.practice.models;



import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="car")
public class Car {
    @Id
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "model")
    private String model;
    @Column (name = "year")
    private int year;
    @Column (name = "color")
    private String color;

    public Car() {
        uuid = UUID.randomUUID().toString();
    }

    public Car(String model, int year, String color) {
        uuid = UUID.randomUUID().toString();
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getId() {
        return uuid;
    }

    public void setId(String uuid) {
        this.uuid = uuid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s", model, year, color);
    }
}
