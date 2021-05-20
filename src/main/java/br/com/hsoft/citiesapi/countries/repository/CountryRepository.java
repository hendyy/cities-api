package br.com.hsoft.citiesapi.countries.repository;

import br.com.hsoft.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
