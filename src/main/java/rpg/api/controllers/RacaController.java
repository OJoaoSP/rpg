package rpg.api.controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rpg.api.models.Status;
import rpg.api.models.dto.DadosRaca;
import rpg.api.repository.RacaRepository;

@RestController
@RequestMapping("/raca")
public class RacaController {

    @Autowired
    private RacaRepository repository;
    @GetMapping("/{id}")
    public ResponseEntity consultaRaca(@PathVariable Long id) throws JsonProcessingException {
        var raca = repository.getReferenceById(id);
        Status st = Status.fromJson(raca.getStatusRaca());
        raca.setStatus(st);
        return ResponseEntity.ok(new DadosRaca(raca));
    }
}
