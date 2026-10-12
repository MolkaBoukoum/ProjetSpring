package molka_boukoum_4ACTUARIAT.tn.esprit.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Equipement;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IEquipementService;
import java.util.List;

@Tag(name = "Gestion des équipements")
@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementController {

    private IEquipementService equipementService;

    @Operation(description = "Ajouter un équipement")
    @PostMapping("/addEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementService.ajouterEquipement(equipement);
    }

    @Operation(description = "Afficher tous les équipements")
    @GetMapping("/getEquipements")
    public List<Equipement> afficherEquipements() {
        return equipementService.afficherEquipements();
    }

    @Operation(description = "Supprimer un équipement par son ID")
    @DeleteMapping("/deleteEquipement/{id}")
    public void supprimerEquipement(@PathVariable("id") Long id) {
        equipementService.supprimerEquipement(id);
    }
    @Operation(description = "Afficher un équipement par ID")
    @GetMapping("/getEquipementById/{id}")
    public Equipement afficherEquipementById(@PathVariable("id") Long id) {
        return equipementService.afficherEquipementById(id);
    }
}