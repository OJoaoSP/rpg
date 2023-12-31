package rpg.api.models.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotNull;

public record dtoCriaPersonagem(
        int nivel,
        String nome,
        @JsonAlias("hp")
        int hpMaximo,
        @JsonAlias("classe")
        int idClasse,
        @JsonAlias("raca")
        Long idRaca,
        @NotNull
        Long usuarioId
) {
}
