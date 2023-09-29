package rpg.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class Status {

    @JsonProperty("forca")
    private int Forca;

    @JsonProperty("destreza")
    private int Destreza;

    @JsonProperty("constituicao")
    private int Constituicao;

    @JsonProperty("inteligencia")
    private int Inteligencia;

    @JsonProperty("sabedoria")
    private int Sabedoria;

    @JsonProperty("carisma")
    private int Carisma;

    public int getModificador(int Atributo){
        return Math.floorDiv((Atributo - 10), 2);
    }

    public static Status fromJson(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Status.class);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Força: ").append(Forca).append("\n");
        sb.append("Destreza: ").append(Destreza).append("\n");
        sb.append("Constituição: ").append(Constituicao).append("\n");
        sb.append("Inteligência: ").append(Inteligencia).append("\n");
        sb.append("Sabedoria: ").append(Sabedoria).append("\n");
        sb.append("Carisma: ").append(Carisma).append("\n");
        return sb.toString();
    }


}
