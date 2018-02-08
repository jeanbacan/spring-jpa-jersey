package br.com.cinq.spring.data.sample.repository.validator;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import br.com.cinq.spring.data.sample.entity.City;

/**
 * Validation of objects
 * @author Jean Bacan
 *
 */
@Component
@RepositoryEventHandler
public class CityValidator {

	@HandleBeforeSave
	public void beforeSave(City city){
		System.out.println("Object valid");
	}
	
	@HandleBeforeCreate
	public void beforeCreate(City city){
		System.out.println("Object valid");
	}
	
}
