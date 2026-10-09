package molka_boukoum_4ACTUARIAT.tn.esprit.Repository;

import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation, Long> {
}
