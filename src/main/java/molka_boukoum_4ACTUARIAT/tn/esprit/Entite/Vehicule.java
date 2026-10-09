package molka_boukoum_4ACTUARIAT.tn.esprit.Entite;



import jakarta.persistence.*;
import lombok.*;
import molka_boukoum_4ACTUARIAT.tn.esprit.Enum.CategorieVehicule;
import molka_boukoum_4ACTUARIAT.tn.esprit.Enum.StatutVehicule;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;

    private String marque;

    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private double tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;

    @OneToMany(mappedBy = "vehicule")
    private Set<Maintenance> maintenances;

    @ManyToMany
    private Set<Equipement> equipements;

    @OneToMany(mappedBy = "vehicule")
    private Set<Reservation> reservations;
}