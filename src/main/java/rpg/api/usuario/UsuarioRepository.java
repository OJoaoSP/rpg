package rpg.api.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    UserDetails findByLogin(String username);
}
