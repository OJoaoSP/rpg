package rpg.api.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rpg.api.models.dto.dtoCriaPersonagem;

@Entity(name = "personagem")
@Table(name = "personagem")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Personagem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int nivel;
    private int hpMaximo;
    private int hpAtual;
    private int qtdDadoHpAtual;
    // outras tabelas
    private int idClasse;
    private int idRaca;
    private Long idUsuario;


    public Personagem(dtoCriaPersonagem dados) {
        this.nome = dados.nome();
        this.nivel = dados.nivel();
        this.hpMaximo = dados.hpMaximo();
        this.hpAtual = dados.hpMaximo();
        this.idClasse = dados.idClasse();
        this.idRaca = dados.idRaca();
        this.idUsuario = dados.usuarioId();
    }
}

