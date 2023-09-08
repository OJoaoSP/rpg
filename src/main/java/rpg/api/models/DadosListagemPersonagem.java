package rpg.api.models;


public record DadosListagemPersonagem(
        Long id,
        String nome,
        int idclasse,
        int idraca){

    public DadosListagemPersonagem(Personagem pp) {
        this( pp.getId() ,pp.getNome(), pp.getIdClasse(), pp.getIdRaca()
        );
    }



}
