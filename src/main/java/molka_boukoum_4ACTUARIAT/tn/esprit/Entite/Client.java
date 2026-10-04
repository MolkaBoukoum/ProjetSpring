package molka_boukoum_4ACTUARIAT.tn.esprit.Entite;



import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String nom;

    private String prenom;

    private String email;

    private String telephone;

    private String numPermis;

    private LocalDate dateInscription;

    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations;

    @OneToOne(mappedBy = "client")
    private Cantrat contrat;
}