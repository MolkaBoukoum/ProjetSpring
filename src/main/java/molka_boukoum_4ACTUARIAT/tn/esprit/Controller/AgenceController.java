package molka_boukoum_4ACTUARIAT.tn.esprit.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Agence;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IAgenceService;
import java.util.List;

@Tag(name = "Gestion des agences")
@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceController {

    private final IAgenceService agenceService;

    @Operation(description = "Ajouter une agence")
    @PostMapping("/addAgence")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }

    @Operation(description = "Afficher toutes les agences")
    @GetMapping("/getAgences")
    public List<Agence> afficherAgences() {
        return agenceService.afficherAgences();
    }

    @Operation(description = "Supprimer une agence par son ID")
    @DeleteMapping("/deleteAgence/{id}")
    public void supprimerAgence(@PathVariable("id") Long id) {
        agenceService.supprimerAgence(id);
    }
    @Operation(description = "Afficher une agence par ID")
    @GetMapping("/getAgenceById/{id}")
    public Agence afficherAgenceById(@PathVariable("id") Long id) {
        return agenceService.afficherAgenceById(id);
    }
}