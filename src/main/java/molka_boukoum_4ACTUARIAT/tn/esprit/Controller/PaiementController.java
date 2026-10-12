package molka_boukoum_4ACTUARIAT.tn.esprit.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Paiement;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IPaiementService;
import java.util.List;

@Tag(name = "Gestion des paiements")
@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementController {

    private IPaiementService paiementService;

    @Operation(description = "Ajouter un paiement")
    @PostMapping("/addPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return paiementService.ajouterPaiement(paiement);
    }

    @Operation(description = "Afficher tous les paiements")
    @GetMapping("/getPaiements")
    public List<Paiement> afficherPaiements() {
        return paiementService.afficherPaiements();
    }

    @Operation(description = "Supprimer un paiement par son ID")
    @DeleteMapping("/deletePaiement/{id}")
    public void supprimerPaiement(@PathVariable("id") Long id) {
        paiementService.supprimerPaiement(id);
    }
    @Operation(description = "Afficher un paiement par ID")
    @GetMapping("/getPaiementById/{id}")
    public Paiement afficherPaiementById(@PathVariable("id") Long id) {
        return paiementService.afficherPaiementById(id);
    }
}