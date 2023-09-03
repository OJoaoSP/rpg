package rpg.api.models.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Getter
    private int id;
    private String nome;
    private String descricao;

    @Getter
    @Setter
    private int quantidade;

    @Override
    public String toString() {
        if (quantidade != 1){
            return "Nome: " + nome + "| Quantidade: " + quantidade;
        }
        return "Nome: " + nome;
    }
}
