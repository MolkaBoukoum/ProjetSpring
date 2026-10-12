package molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces;

import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    List<Reservation> afficherReservations();
    void supprimerReservation(Long id);
    Reservation afficherReservationById(Long id);

}
