package molka_boukoum_4ACTUARIAT.tn.esprit.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Vehicule;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IVehiculeService;
import java.util.List;

@Tag(name = "Gestion des véhicules")
@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeController {

    private IVehiculeService vehiculeService;

    @Operation(description = "Ajouter un véhicule")
    @PostMapping("/addVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @Operation(description = "Afficher tous les véhicules")
    @GetMapping("/getVehicules")
    public List<Vehicule> afficherVehicules() {
        return vehiculeService.afficherVehicules();
    }

    @Operation(description = "Supprimer un véhicule par son ID")
    @DeleteMapping("/deleteVehicule/{id}")
    public void supprimerVehicule(@PathVariable("id") Long id) {
        vehiculeService.supprimerVehicule(id);
    }
    @Operation(description = "Afficher un véhicule par ID")
    @GetMapping("/getVehiculeById/{id}")
    public Vehicule afficherVehiculeById(@PathVariable("id") Long id) {
        return vehiculeService.afficherVehiculeById(id);
    }
}