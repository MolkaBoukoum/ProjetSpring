package molka_boukoum_4ACTUARIAT.tn.esprit.Entite;


import jakarta.persistence.*;
import lombok.*;
import molka_boukoum_4ACTUARIAT.tn.esprit.Enum.RoleEmploye;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;

    private String nom;

    private String prenom;

    @Enumerated(EnumType.STRING)
    private RoleEmploye role;

    @ManyToOne

    private Agence agence;
}