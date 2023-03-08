package system.managment.pharmacy.pharmacy.system.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String producer;
    private String description;
    private String category;
    @OneToMany
    private Set<DrugComponent> drugComposition;


    //TODO: substancje czyne
    //TODO: zastosowania

}
