package molka_boukoum_4ACTUARIAT.tn.esprit.Repository;

import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepo extends JpaRepository<Paiement, Long> {
}
