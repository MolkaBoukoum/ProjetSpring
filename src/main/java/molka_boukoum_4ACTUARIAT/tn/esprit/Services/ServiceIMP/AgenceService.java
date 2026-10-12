package molka_boukoum_4ACTUARIAT.tn.esprit.Services.ServiceIMP;

import lombok.AllArgsConstructor;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Agence;
import molka_boukoum_4ACTUARIAT.tn.esprit.Repository.AgenceRepository;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IAgenceService;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class AgenceService implements IAgenceService {

    private  AgenceRepository agenceRepository;


    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepository.save(agence);    }

    @Override
    public List<Agence> afficherAgences() {
        return agenceRepository.findAll();    }

    @Override
    public void supprimerAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    public Agence afficherAgenceById(Long id) {
        return agenceRepository.findById(id).orElse(null);
}
}