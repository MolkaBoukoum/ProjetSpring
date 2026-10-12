package molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces;

import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Cantrat;

import java.util.List;

public interface IContarService {
    Cantrat ajouterCantrat(Cantrat cantrat);
    List<Cantrat> afficherCantrats();

    void supprimerCantrat(Long id);
    Cantrat afficherCantratById(Long id);

}
