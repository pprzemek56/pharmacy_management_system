package system.managment.pharmacy.pharmacy.system.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.managment.pharmacy.pharmacy.system.entities.Drug;
import system.managment.pharmacy.pharmacy.system.requests.AddDrugRequest;
import system.managment.pharmacy.pharmacy.system.services.DrugService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/drug")
public class DrugController {

    private final DrugService drugService;

    @PostMapping
    public Drug addDrug(@RequestBody AddDrugRequest addDrugRequest){
        return drugService.addDrug(addDrugRequest);
    }

}
