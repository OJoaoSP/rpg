package rpg.api.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import rpg.api.models.item.Item;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
public class Mochila {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonagem;
    private ArrayList<Item> itens;


    public Mochila(int idMochila){
        this.idPersonagem = idMochila;
    }

    public void adicionarItem(Item item){
        if (itens == null){
            itens = new ArrayList<Item>();
        }
        var id = itens.stream().filter(itemT -> itemT.getId() == item.getId()).toList();
        if (id.isEmpty()){
            itens.add(item);
        } else {
            item.setQuantidade(id.get(0).getQuantidade() + item.getQuantidade());
            itens.add(itens.indexOf(id.get(0)), item);
        }

    }
    public void excluirItem(Item item){
        this.itens.remove(item);
    }
    @Override
    public String toString() {

        return this.itens.toString();
    }

}
