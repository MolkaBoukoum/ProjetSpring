package molka_boukoum_4ACTUARIAT.tn.esprit.Entite;



import jakarta.persistence.*;
import lombok.*;
import molka_boukoum_4ACTUARIAT.tn.esprit.Enum.StatutReservation;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;

    @ManyToOne
    private Vehicule vehicule;

    @ManyToOne
    private Client client;

    @OneToOne(mappedBy = "reservation")
    private Cantrat contrat;
}