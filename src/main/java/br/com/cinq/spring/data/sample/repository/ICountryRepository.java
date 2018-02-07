package br.com.cinq.spring.data.sample.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cinq.spring.data.sample.entity.Country;

/**
 * Coutnry Repository for data persist
 * 
 * @author Jean Bacan
 *
 */
public interface ICountryRepository extends CrudRepository<Country, Long> {

}
