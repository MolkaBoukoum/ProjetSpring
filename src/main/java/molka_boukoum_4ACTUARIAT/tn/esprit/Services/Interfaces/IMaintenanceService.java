package molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces;

import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    List<Maintenance> afficherMaintenances();
    void supprimerMaintenance(Long id);
    Maintenance afficherMaintenanceById(Long id);

}
