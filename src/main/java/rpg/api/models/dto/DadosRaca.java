package rpg.api.models.dto;

import rpg.api.models.Raca;
import rpg.api.models.Status;

import java.util.Optional;

public record DadosRaca(
        Long id,
        String nome,
        Status statusDaRaca,
        int movimentacaoTerreno,
        int movimentacaoVoo,
        int movimentacaoEscalada,
        int alcanceVisaoNoturna
) { public DadosRaca(Raca dado){
    this(dado.getId(),dado.getNome(),dado.getStatus() ,dado.getMovClimb(),
            dado.getMovVoo(), dado.getMovClimb(), dado.getAlcanceVisaoNoturna());
}

}
