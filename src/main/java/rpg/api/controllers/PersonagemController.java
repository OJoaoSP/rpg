package rpg.api.controllers;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import rpg.api.models.DadosListagemPersonagem;
import rpg.api.models.Personagem;
import rpg.api.models.dto.dtoCriaPersonagem;
import rpg.api.repository.PersonagemRepository;

@RestController
@RequestMapping("api/personagem")
@CrossOrigin(origins = "*", exposedHeaders = "Location")
public class PersonagemController {
    @Autowired
    PersonagemRepository repository;
    @PostMapping
    @Transactional
    public ResponseEntity cadastraPersonagem(@RequestBody @Valid dtoCriaPersonagem personagem_criado, UriComponentsBuilder uriBuilder) {
        System.out.println(personagem_criado);
        var person = new Personagem(personagem_criado);
        repository.save(person);
        //var uri = uriBuilder.path("api/personagem/{id}").buildAndExpand(person.getId()).toUri();
        return ResponseEntity.ok().build();  //created(uri).body(new dadosDetalhesPersonagem(person));
    }

    @GetMapping("/listagem/{login}")
    public ResponseEntity<Page<DadosListagemPersonagem>> listagem(@PageableDefault(size = 10, page = 0, sort = {"nome"} ) Pageable paginacao,
                                                                  @PathVariable String login) {
        var page = repository.ListaDePersonagem(login, paginacao).map(DadosListagemPersonagem::new);
        return  ResponseEntity.ok(page);
    }


}
