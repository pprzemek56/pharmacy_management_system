package system.managment.pharmacy.pharmacy.system.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String producer;
    private String description;
    private int quantity;
    private double price;
    private boolean isPrescribed;

    //TODO: substancje czyne
    //TODO: zastosowania

}
