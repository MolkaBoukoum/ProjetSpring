package molka_boukoum_4ACTUARIAT.tn.esprit.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Maintenance;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IMaintenanceService;
import java.util.List;

@Tag(name = "Gestion des maintenances")
@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceController {

    private IMaintenanceService maintenanceService;

    @Operation(description = "Ajouter une maintenance")
    @PostMapping("/addMaintenance")
    public Maintenance ajouterMaintenance(
            @RequestBody Maintenance maintenance) {
        return maintenanceService.ajouterMaintenance(maintenance);
    }

    @Operation(description = "Afficher toutes les maintenances")
    @GetMapping("/getMaintenances")
    public List<Maintenance> afficherMaintenances() {
        return maintenanceService.afficherMaintenances();
    }

    @Operation(description = "Supprimer une maintenance par son ID")
    @DeleteMapping("/deleteMaintenance/{id}")
    public void supprimerMaintenance(@PathVariable("id") Long id) {
        maintenanceService.supprimerMaintenance(id);
    }
    @Operation(description = "Afficher une maintenance par ID")
    @GetMapping("/getMaintenanceById/{id}")
    public Maintenance afficherMaintenanceById(@PathVariable("id") Long id) {
        return maintenanceService.afficherMaintenanceById(id);
    }
}