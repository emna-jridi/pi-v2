package gestionnaireEtudiant.pi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Etudiant")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @Column( name = "first_name")
    private String firstName;

    @Column(name ="last_name" )
    private String lastName ;
    @Column( name = "email")
    private String email ;
    @Column( name = "cin")
    private String cin ;
    @Column( name = "num_carte_etud")
    private int num_carte_etud;
    @Column( name = "classe")
    private String classe ;
}
