package pl.carshare.carshare.rental.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RentalRepository extends CrudRepository<Rental, Long> {
    List<Rental> findAll();
}
