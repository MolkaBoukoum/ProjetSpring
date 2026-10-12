package molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces;

import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);
    List<Vehicule> afficherVehicules();
    void supprimerVehicule(Long id);
    Vehicule afficherVehiculeById(Long id);
}
