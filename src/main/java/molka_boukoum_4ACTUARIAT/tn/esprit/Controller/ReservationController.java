package molka_boukoum_4ACTUARIAT.tn.esprit.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Reservation;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IReservationService;
import java.util.List;

@Tag(name = "Gestion des réservations")
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private IReservationService reservationService;

    @Operation(description = "Ajouter une réservation")
    @PostMapping("/addReservation")
    public Reservation ajouterReservation(
            @RequestBody Reservation reservation) {
        return reservationService.ajouterReservation(reservation);
    }

    @Operation(description = "Afficher toutes les réservations")
    @GetMapping("/getReservations")
    public List<Reservation> afficherReservations() {
        return reservationService.afficherReservations();
    }

    @Operation(description = "Supprimer une réservation par son ID")
    @DeleteMapping("/deleteReservation/{id}")
    public void supprimerReservation(@PathVariable("id") Long id) {
        reservationService.supprimerReservation(id);
    }
    @Operation(description = "Afficher une réservation par ID")
    @GetMapping("/getReservationById/{id}")
    public Reservation afficherReservationById(@PathVariable("id") Long id) {
        return reservationService.afficherReservationById(id);
    }
}