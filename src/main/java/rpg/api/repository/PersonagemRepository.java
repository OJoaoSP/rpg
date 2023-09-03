package rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rpg.api.models.Personagem;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long> {
}
