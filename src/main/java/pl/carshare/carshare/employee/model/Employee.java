package pl.carshare.carshare.employee.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import pl.carshare.carshare.branch.model.Branch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Length(min = 2, message = "First name is too short. Use minimum 2 signs.")
    private String firstName;

    @Length(min = 2, message = "First name is too short. Use minimum 2 signs.")
    private String lastName;

    @NotNull
    private Position position;

    @NotNull
    private Branch employeeBranch;
}
