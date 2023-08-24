package rpg.api.models;

import lombok.Getter;

@Getter
public class Status {

    private int Forca;
    private int Destreza;
    private int Constituicao;
    private int Inteligencia;
    private int Sabedoria;
    private int Carisma;

    public int getModificaFor(){
        return Math.floorDiv((this.getForca() - 10), 2);
    }


}
