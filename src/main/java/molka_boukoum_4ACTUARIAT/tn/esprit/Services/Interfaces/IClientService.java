package molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces;

import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Client;

import java.util.List;

public interface IClientService {
    Client ajouterClient(Client client);
    List<Client> afficherClients();
    void supprimerClient(Long id);
    Client afficherClientById(Long id);

}
