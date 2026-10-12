package molka_boukoum_4ACTUARIAT.tn.esprit.Services.ServiceIMP;

import lombok.AllArgsConstructor;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Vehicule;
import molka_boukoum_4ACTUARIAT.tn.esprit.Repository.VehiculeRepo;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IVehiculeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {
    private final VehiculeRepo vehiculeRepo;
    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }

    @Override
    public List<Vehicule> afficherVehicules() {
        return vehiculeRepo.findAll();

    }

    @Override
    public void supprimerVehicule(Long id) {
        vehiculeRepo.deleteById(id);
    }

    @Override
    public Vehicule afficherVehiculeById(Long id) {
        return vehiculeRepo.findById(id).orElse(null);
    }
}
