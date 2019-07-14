package pl.carshare.carshare.rental.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
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

    @Length(min = 2, message = "Name is too short. Use minimum 2 signs.")
    private String name;

    @Length(min = 9, message = "Internet Domain is too short. Use minimum 9 signs.")
    private String internetDomain;

    @Length(min = 10, message = "Address is too short. Use minimum 2 signs.")
    private String address;

    @Length(min = 2, message = "Owner name is too short. Use minimum 2 signs.")
    private String owner;

    @Length(min = 9, message = "Logotype address is too short. Use minimum 2 signs.")
    private String logotype;

    private List<Branch> listOfBranches;
}
