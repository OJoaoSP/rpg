package rpg.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rpg.api.models.Personagem;

import java.util.Optional;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long> {
    @Query("""
    SELECT p
    FROM personagem p
    WHERE p.idUsuario = (select u.id from usuarios u where u.login = :login )
""")
    Page<Personagem> ListaDePersonagem( String login,  Pageable pageable);
}
