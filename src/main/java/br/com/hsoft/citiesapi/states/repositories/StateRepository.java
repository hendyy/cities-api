package br.com.hsoft.citiesapi.states.repositories;

import br.com.hsoft.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
