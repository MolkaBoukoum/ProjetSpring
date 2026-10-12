package molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces;

import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Agence;

import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence agence);
    List<Agence> afficherAgences();
    void supprimerAgence(Long id);
    Agence afficherAgenceById(Long id);

}
