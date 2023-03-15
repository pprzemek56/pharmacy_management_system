package system.managment.pharmacy.pharmacy.system.requests;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import system.managment.pharmacy.pharmacy.system.entities.DrugComponent;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddDrugRequest {

    private String name;
    private String producer;
    private String category;
    private String description;
    //private Set<DrugComponent> drugComponents;


}
