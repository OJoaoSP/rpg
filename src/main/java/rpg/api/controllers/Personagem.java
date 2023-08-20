package rpg.api.controllers;


import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Personagem {
    @Id
    private Long id;

    private String nome;

    private int hpMaximo;
    private int hpAtual;



}
