package system.managment.pharmacy.pharmacy.system.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Opinion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int rate;
    private String comment;
    private LocalDate creationDate;
    @ManyToOne
    private Drug drug;
    @ManyToOne
    private PharmacyUser pharmacyUser;
}
