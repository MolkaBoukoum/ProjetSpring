package molka_boukoum_4ACTUARIAT.tn.esprit.Repository;

import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Cantrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Cantrat , Long> {
}
