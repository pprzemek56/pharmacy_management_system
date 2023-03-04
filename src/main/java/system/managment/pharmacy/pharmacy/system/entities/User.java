package system.managment.pharmacy.pharmacy.system.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    private String name;
    private String surname;
    private String email;
    private String password;
    private String phoneNumber;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
