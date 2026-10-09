package molka_boukoum_4ACTUARIAT.tn.esprit.Entite;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;

    private String ville;

    private String adresse;

    private String telephone;

    @OneToMany(mappedBy = "agence")
    private Set<Employe> employes;

    @OneToMany(mappedBy = "agence")
    private Set<Vehicule> vehicules;
}