package rpg.api.models.item;

import rpg.api.models.Mochila;

public class main {
    public static void main(String[] arg){
        var item = new Item(1, "Teste item", "Alguma descrição", 2);
        var item1 = new Item(2, "Teste 1", "Alguma descrição", 1);
        var item2 = new Item(1, "Teste item", "Alguma descrição", 9);
        var mochila = new Mochila(1);

        mochila.adicionarItem(item);
        mochila.adicionarItem(item1);
        mochila.adicionarItem(item2);
        System.out.println(mochila);


        mochila.excluirItem(item2);
        System.out.println(mochila);

        };

    }
