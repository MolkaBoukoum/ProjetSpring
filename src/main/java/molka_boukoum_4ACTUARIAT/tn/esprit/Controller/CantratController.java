package molka_boukoum_4ACTUARIAT.tn.esprit.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Cantrat;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IContarService;
import java.util.List;

@Tag(name = "Gestion des contrats")
@RestController
@AllArgsConstructor
@RequestMapping("/cantrat")
public class CantratController {

    private IContarService cantratService;

    @Operation(description = "Ajouter un contrat")
    @PostMapping("/addCantrat")
    public Cantrat ajouterCantrat(@RequestBody Cantrat cantrat) {
        return cantratService.ajouterCantrat(cantrat);
    }

    @Operation(description = "Afficher tous les contrats")
    @GetMapping("/getCantrats")
    public List<Cantrat> afficherCantrats() {
        return cantratService.afficherCantrats();
    }

    @Operation(description = "Supprimer un contrat par son ID")
    @DeleteMapping("/deleteCantrat/{id}")
    public void supprimerCantrat(@PathVariable("id") Long id) {
        cantratService.supprimerCantrat(id);
    }
    @Operation(description = "Afficher un contrat par ID")
    @GetMapping("/getCantratById/{id}")
    public Cantrat afficherCantratById(@PathVariable("id") Long id) {
        return cantratService.afficherCantratById(id);
    }
}