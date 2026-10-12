package molka_boukoum_4ACTUARIAT.tn.esprit.Services.ServiceIMP;

import lombok.AllArgsConstructor;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Paiement;
import molka_boukoum_4ACTUARIAT.tn.esprit.Repository.PaiementRepo;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IPaiementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementService implements IPaiementService {
    private final PaiementRepo paiementRepo;
    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return paiementRepo.save(paiement);
    }

    @Override
    public List<Paiement> afficherPaiements() {
        return paiementRepo.findAll();
    }

    @Override
    public void supprimerPaiement(Long id) {
        paiementRepo.deleteById(id);

    }

    @Override
    public Paiement afficherPaiementById(Long id) {
        return paiementRepo.findById(id).orElse(null);
    }
}
