package rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rpg.api.models.Personagem;
import rpg.api.models.Raca;

public interface RacaRepository extends JpaRepository<Raca, Long> {
}
