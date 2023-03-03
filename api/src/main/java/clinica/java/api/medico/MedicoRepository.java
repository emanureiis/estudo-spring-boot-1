package clinica.java.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

//Its responsible for to lead with the persistence of the data object. Its contain all CRUD Methods
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
