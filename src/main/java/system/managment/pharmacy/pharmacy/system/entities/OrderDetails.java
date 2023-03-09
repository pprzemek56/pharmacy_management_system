package system.managment.pharmacy.pharmacy.system.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private LocalDate creationDate;
    private String status;
    private String paymentType;
    private LocalDate expirationDate;
    private double price;
    @OneToMany
    private List<DrugItem> drugItems;

}
