package molka_boukoum_4ACTUARIAT.tn.esprit.Services.ServiceIMP;

import lombok.AllArgsConstructor;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Client;
import molka_boukoum_4ACTUARIAT.tn.esprit.Repository.ClientRepository;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientService implements IClientService {

    private ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);    }

    @Override
    public List<Client> afficherClients() {
        return clientRepository.findAll();
    }

    @Override
    public void supprimerClient(Long id) {
        clientRepository.deleteById(id);


    }

    public Client afficherClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
}}
