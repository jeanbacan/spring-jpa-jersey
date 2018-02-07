package br.com.cinq.spring.data.sample.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cinq.spring.data.sample.entity.City;

/**
 * City Repository for data persist
 * @author Jean Bacan
 *
 */
public interface ICityRepository extends CrudRepository<City, Long> {

}
