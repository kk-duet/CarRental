package pl.carshare.carshare.car.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findAll();
}
