package rpg.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import rpg.api.models.Status;
@Entity
public class Raca {
    @Id
    private Long id;
    private Status statusRaca;
    private int opcao;
    private int movAndar;
    private int movVoo;
    private int movClimb;
    private int alcanceVisaoNoturna;




}
