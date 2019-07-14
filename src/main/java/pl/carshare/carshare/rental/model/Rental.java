package pl.carshare.carshare.rental.model;

import lombok.Data;
import pl.carshare.carshare.branch.model.Branch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String internetDomain;

    private String address;

    private String owner;

    private String logotype;

    private List<Branch> listOfBranches;
}
