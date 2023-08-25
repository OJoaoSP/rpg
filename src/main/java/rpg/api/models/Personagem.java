package rpg.api.models;


import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Personagem {
    @Id
    private Long id;
    private String nome;
    private int hpMaximo;
    private int hpAtual;
    private int qtdDadoHpAtual;
    // outras tabelas
    private int idClasse;
    private int idRaca;
    private int idUsuario;
    private int idMochila;


}
