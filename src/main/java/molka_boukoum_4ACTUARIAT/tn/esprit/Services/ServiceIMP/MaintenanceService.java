package molka_boukoum_4ACTUARIAT.tn.esprit.Services.ServiceIMP;

import lombok.AllArgsConstructor;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Maintenance;
import molka_boukoum_4ACTUARIAT.tn.esprit.Repository.MaintenanceRepository;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IMaintenanceService;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class MaintenanceService implements IMaintenanceService {

    private final MaintenanceRepository maintenanceRepository;
    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);    }

    @Override
    public List<Maintenance> afficherMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public void supprimerMaintenance(Long id) {
        maintenanceRepository.deleteById(id);

    }

    @Override
    public Maintenance afficherMaintenanceById(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }
}
