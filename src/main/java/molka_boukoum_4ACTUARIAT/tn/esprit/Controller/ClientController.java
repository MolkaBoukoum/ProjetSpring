package molka_boukoum_4ACTUARIAT.tn.esprit.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Client;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IClientService;
import java.util.List;

@Tag(name = "Gestion des clients")
@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private IClientService clientService;

    @Operation(description = "Ajouter un client")
    @PostMapping("/addClient")
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @Operation(description = "Afficher tous les clients")
    @GetMapping("/getClients")
    public List<Client> afficherClients() {
        return clientService.afficherClients();
    }

    @Operation(description = "Supprimer un client par son ID")
    @DeleteMapping("/deleteClient/{id}")
    public void supprimerClient(@PathVariable("id") Long id) {
        clientService.supprimerClient(id);
    }
    @Operation(description = "Afficher un client par ID")
    @GetMapping("/getClientById/{id}")
    public Client afficherClientById(@PathVariable("id") Long id) {
        return clientService.afficherClientById(id);
    }
}