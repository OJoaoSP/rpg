package rpg.api.models.dto;

import rpg.api.models.Status;

public record DadosStatus(
        int Forca,
        int Destreza,
        int Constituicao,
        int Inteligencia,
        int Sabedoria,
        int Carisma
) { public DadosStatus(Status dados){
    this(dados.getForca(), dados.getDestreza(), dados.getConstituicao()
        ,dados.getInteligencia(), dados.getSabedoria(), dados.getCarisma());
}
}
