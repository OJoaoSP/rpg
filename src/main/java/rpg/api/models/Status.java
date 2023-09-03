package rpg.api.models;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class Status {

    private int Forca;
    private int Destreza;
    private int Constituicao;
    private int Inteligencia;
    private int Sabedoria;
    private int Carisma;

    public int getModificador(int Atributo){
        return Math.floorDiv((Atributo - 10), 2);
    }


}
