package system.managment.pharmacy.pharmacy.system.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class WholesaleCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    private String NIP;

}
