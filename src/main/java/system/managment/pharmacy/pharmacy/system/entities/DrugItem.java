package system.managment.pharmacy.pharmacy.system.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class DrugItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "drug_id")
    private Drug drug;
    private double price;
    private LocalDate expirationDate;

}
