package rpg.api.controllers;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import rpg.api.models.Personagem;
import rpg.api.models.dto.dtoCriaPersonagem;
import rpg.api.models.dto.dadosDetalhesPersonagem;
import rpg.api.repository.PersonagemRepository;

@RestController("api/personagem")
public class PersonagemController {
    @Autowired
    PersonagemRepository repository;
    @PostMapping
    @Transactional
    public ResponseEntity cadastraPersonagem(@RequestBody @Valid dtoCriaPersonagem personagem_criado, UriComponentsBuilder uriBuilder) {
        System.out.println(personagem_criado);
        var person = new Personagem(personagem_criado);
        repository.save(person);
        var uri = uriBuilder.path("api/personagem/{id}").buildAndExpand(person.getId()).toUri();
        return ResponseEntity.created(uri).body(new dadosDetalhesPersonagem(person));
    }

}
