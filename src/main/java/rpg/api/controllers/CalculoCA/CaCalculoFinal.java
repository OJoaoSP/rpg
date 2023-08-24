package rpg.api.controllers.CalculoCA;

import rpg.api.models.Classe;

public class CaCalculoFinal extends CalculoCA{

    public CaCalculoFinal(CalculoCA proximo) {
        super(proximo);
    }



    @Override
    public boolean deveAplicar(Classe classe) {
        return true;
    }

    @Override
    public int efetuarCalculo(Classe classe) {
        return 0;
    }
}
