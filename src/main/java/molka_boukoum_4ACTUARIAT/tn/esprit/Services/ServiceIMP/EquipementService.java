package molka_boukoum_4ACTUARIAT.tn.esprit.Services.ServiceIMP;

import lombok.AllArgsConstructor;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Equipement;
import molka_boukoum_4ACTUARIAT.tn.esprit.Repository.EquipementRepository;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IEquipementService;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class EquipementService implements IEquipementService {

    private EquipementRepository equipementRepository;

    @Override
    public Equipement ajouterEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public List<Equipement> afficherEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public void supprimerEquipement(Long id) {
        equipementRepository.deleteById(id);


    }

    @Override
    public Equipement afficherEquipementById(Long id) {
        return equipementRepository.findById(id).orElse(null);

    }
}
