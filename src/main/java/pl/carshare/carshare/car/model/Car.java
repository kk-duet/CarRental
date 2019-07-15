package pl.carshare.carshare.car.model;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@Getter
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;

    private String model;

    private CarBody carBodyStyle;

    private Integer yearbook;

    private String color;

    private Integer course;

    private Status status;

    private double price;

    public void setCourse(Integer course) {
        this.course = course;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
