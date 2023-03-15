package system.managment.pharmacy.pharmacy.system.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import system.managment.pharmacy.pharmacy.system.entities.Drug;
import system.managment.pharmacy.pharmacy.system.repositories.DrugRepository;
import system.managment.pharmacy.pharmacy.system.requests.AddDrugRequest;

@Service
@RequiredArgsConstructor
public class DrugService {
    private final DrugRepository drugRepository;


    @Transactional
    public Drug addDrug(AddDrugRequest addDrugRequest){
        Drug drug = Drug.builder()
                .name(addDrugRequest.getName())
                .producer(addDrugRequest.getProducer())
                .category(addDrugRequest.getCategory())
                .description(addDrugRequest.getDescription())
                //.drugComponents(addDrugRequest.setDrugComponents())
                .build();

        drugRepository.save(drug);
        return drug;

    }

}
