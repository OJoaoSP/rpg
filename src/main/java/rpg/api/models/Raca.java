package rpg.api.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.databind.JsonNode;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import rpg.api.models.Status;
@Entity
@Table(name = "raca")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Raca {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Para Trazer do banco
    private String statusRaca;
    //Para Devolver em json
    @Transient @Setter
    private Status status;
    private String nome;
    private Long opcao;
    private Long idRaca;
    private int movAndar;
    private int movVoo;
    private int movClimb;
    private int alcanceVisaoNoturna;




}
