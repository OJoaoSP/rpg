package rpg.api.models.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import rpg.api.models.Personagem;

public record dadosDetalhesPersonagem(
        Long id,
        int nivel,
        String nome,
        int hpMaximo,
        int hpAtual,
        int idClasse,
        Long idRaca,
        Long idUsuario) {
    public dadosDetalhesPersonagem(Personagem pp) {
        this( pp.getId(),pp.getNivel(), pp.getNome(), pp.getHpMaximo(),pp.getHpAtual(),
                pp.getIdClasse(),pp.getIdRaca(), pp.getIdUsuario());
    }
}
