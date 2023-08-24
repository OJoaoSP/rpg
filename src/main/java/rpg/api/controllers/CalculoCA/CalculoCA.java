package rpg.api.controllers.CalculoCA;

import rpg.api.models.Classe;

public abstract class CalculoCA {
    protected CalculoCA proximo;
    public CalculoCA(CalculoCA proximo){
        this.proximo = proximo;
    }

    public int Calcular(Classe classe){
        if (deveAplicar(classe)){
            return efetuarCalculo(classe);
        }
        return this.proximo.Calcular(classe);
    }

    public abstract boolean deveAplicar(Classe classe);
    public abstract int efetuarCalculo(Classe classe);

}
