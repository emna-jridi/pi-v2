package gestionnaireEtudiant.pi.repository;

import gestionnaireEtudiant.pi.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
