package system.managment.pharmacy.pharmacy.system.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Entity
@Builder
@RequiredArgsConstructor
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String producer;
    private String category;
    private String description;
    @OneToMany
    private Set<DrugComponent> drugComponents;

}
