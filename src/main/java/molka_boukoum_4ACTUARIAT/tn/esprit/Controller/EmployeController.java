package molka_boukoum_4ACTUARIAT.tn.esprit.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Employe;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IEmployeService;
import java.util.List;

@Tag(name = "Gestion des employés")
@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeController {

    private IEmployeService employeService;

    @Operation(description = "Ajouter un employé")
    @PostMapping("/addEmploye")
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.ajouterEmploye(employe);
    }

    @Operation(description = "Afficher tous les employés")
    @GetMapping("/getEmployes")
    public List<Employe> afficherEmployes() {
        return employeService.afficherEmployes();
    }

    @Operation(description = "Supprimer un employé par son ID")
    @DeleteMapping("/deleteEmploye/{id}")
    public void supprimerEmploye(@PathVariable("id") Long id) {
        employeService.supprimerEmploye(id);
    }
    @Operation(description = "Afficher un employé par ID")
    @GetMapping("/getEmployeById/{id}")
    public Employe afficherEmployeById(@PathVariable("id") Long id) {
        return employeService.afficherEmployeById(id);
    }
}