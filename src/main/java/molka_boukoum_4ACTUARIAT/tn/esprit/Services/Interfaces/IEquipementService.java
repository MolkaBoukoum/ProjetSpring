package molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces;

import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    List<Equipement> afficherEquipements();
    void supprimerEquipement(Long id);
    Equipement afficherEquipementById(Long id);

}
