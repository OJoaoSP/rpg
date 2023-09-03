package rpg.api.models.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record dtoCriaPersonagem(
        int nivel,
        String nome,
        @JsonAlias("hp")
        int hpMaximo,
        @JsonAlias("classe")
        int idClasse,
        @JsonAlias("raca")
        int idRaca
) {
}
