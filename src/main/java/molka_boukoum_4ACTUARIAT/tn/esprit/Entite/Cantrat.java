package molka_boukoum_4ACTUARIAT.tn.esprit.Entite;



import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Cantrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private LocalDate dateSignature;

    private BigDecimal montantTotal;

    private boolean valide;

    @OneToOne
    @JoinColumn(name = "id_client", unique = true)
    private Client client;

    @OneToOne
    @JoinColumn(name = "id_reservation", unique = true)
    private Reservation reservation;

    @OneToMany(
            mappedBy = "contrat",
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    private List<Paiement> paiements;
}