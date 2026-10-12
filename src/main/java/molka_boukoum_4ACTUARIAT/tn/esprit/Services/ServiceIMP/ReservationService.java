package molka_boukoum_4ACTUARIAT.tn.esprit.Services.ServiceIMP;

import lombok.AllArgsConstructor;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Reservation;
import molka_boukoum_4ACTUARIAT.tn.esprit.Repository.ReservationRepo;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationService implements IReservationService {
    private final ReservationRepo reservationRepo;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public List<Reservation> afficherReservations() {
        return reservationRepo.findAll();
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationRepo.deleteById(id);
    }

    @Override
    public Reservation afficherReservationById(Long id) {
        return reservationRepo.findById(id).orElse(null);
    }
}
