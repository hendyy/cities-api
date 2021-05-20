package br.com.hsoft.citiesapi.states.resources;

import java.util.List;

import br.com.hsoft.citiesapi.states.entities.State;
import br.com.hsoft.citiesapi.states.repositories.StateRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/states")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> states() {
        return repository.findAll();
    }
}
