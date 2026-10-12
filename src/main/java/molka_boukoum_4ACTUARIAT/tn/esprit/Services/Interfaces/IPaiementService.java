package molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces;

import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement paiement);
    List<Paiement> afficherPaiements();
    void supprimerPaiement(Long id);
    Paiement afficherPaiementById(Long id);

}
