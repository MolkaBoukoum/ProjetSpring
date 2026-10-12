package molka_boukoum_4ACTUARIAT.tn.esprit.Services.ServiceIMP;

import lombok.AllArgsConstructor;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Cantrat;
import molka_boukoum_4ACTUARIAT.tn.esprit.Repository.ContratRepository;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IContarService;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ContarService implements IContarService {

    private  final ContratRepository contratRepository;
    @Override
    public Cantrat ajouterCantrat(Cantrat cantrat) {
        return contratRepository.save(cantrat);
    }

    @Override
    public List<Cantrat> afficherCantrats() {
        return contratRepository.findAll();
    }



    @Override
    public void supprimerCantrat(Long id) {
        contratRepository.deleteById(id);


    }

    @Override
    public Cantrat afficherCantratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }


}
