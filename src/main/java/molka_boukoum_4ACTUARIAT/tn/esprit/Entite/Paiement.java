package molka_boukoum_4ACTUARIAT.tn.esprit.Entite;


import jakarta.persistence.*;
import lombok.*;
import molka_boukoum_4ACTUARIAT.tn.esprit.Enum.ModePaiement;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;

    private BigDecimal montant;

    private LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    private ModePaiement modePaiement;


    @ManyToOne

    private Cantrat contrat;
}