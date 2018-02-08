package br.com.cinq.spring.data.sample.dto;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.entity.Country;

/**
 * DTO to give more flexibility to our domain/view classes
 * Could use framework such MapStruct. Since it's small, lets keep it simple.
 * 
 * @author Jean Bacan
 *
 */
public class CityDTO {

	private Long id;

	private String name;

	private CountryDTO country;

	/**
	 * Only for DTO's use
	 * @param city
	 */
	protected CityDTO(City city){
		this.id = city.getId();
		this.name = city.getName();
	}
	
	public CityDTO(City city, Country country) {
		this.id = city.getId();
		this.name = city.getName();
		this.country = new CountryDTO(country);
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the country
	 */
	public CountryDTO getCountry() {
		return country;
	}

}
