package rpg.api.controllers.CalculoCA;

import rpg.api.models.Classe;

public class CaCalculoComArmaduraEscudo extends CalculoCA {
    public CaCalculoComArmaduraEscudo(CalculoCA proximo){
        super(proximo);
    }

    @Override
    public boolean deveAplicar(Classe classe) {
        return false;
    }

    @Override
    public int efetuarCalculo(Classe classe) {
        return 0;
    }
}
