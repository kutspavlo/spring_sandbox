package spring.practice.models;

import org.hibernate.annotations.CollectionId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="first_db")
public class Car {
    @Column
    private String uuid;
    @Column
    private String model;
    @Column
    private short year;
    @Column
    private String color;

    public Car() {
        uuid = UUID.randomUUID().toString();
    }

    public Car(String model, short year, String color) {
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

    public short getYear() {
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
}
