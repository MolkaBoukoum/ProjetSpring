package molka_boukoum_4ACTUARIAT.tn.esprit.Entite;



import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

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
    private Long idContrat; //type wrapper

    private LocalDate dateSignature;

    private BigDecimal montantTotal;

    private boolean valide;

    @OneToOne
    private Client client;

    @OneToOne
    private Reservation reservation;

    @OneToMany(
            mappedBy = "contrat",
            cascade = {
                    CascadeType.PERSIST
            }
    )
    private Set<Paiement> paiements;
}