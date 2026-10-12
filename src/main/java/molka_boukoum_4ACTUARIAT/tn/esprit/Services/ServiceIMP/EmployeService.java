package molka_boukoum_4ACTUARIAT.tn.esprit.Services.ServiceIMP;

import lombok.AllArgsConstructor;
import molka_boukoum_4ACTUARIAT.tn.esprit.Entite.Employe;
import molka_boukoum_4ACTUARIAT.tn.esprit.Repository.EmployeRepository;
import molka_boukoum_4ACTUARIAT.tn.esprit.Services.Interfaces.IEmployeService;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeService implements IEmployeService {

    private EmployeRepository employeRepository;



    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> afficherEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public void supprimerEmploye(Long id) {
        employeRepository.deleteById(id);


    }

    @Override
    public Employe afficherEmployeById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }
}
