package br.com.cinq.spring.data.sample.dto;

import java.util.Set;
import java.util.TreeSet;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.entity.Country;

/**
 * DTO to give more flexibility to our domain/view classes Could be using
 * Could use framework such MapStruct. Since it's small, lets keep it simple.
 * 
 * @author Jean Bacan
 *
 */
public class CountryDTO {

	private Long id;

	private String name;

	private Set<CityDTO> cities;

	/**
	 * WHen need to convert a country with cities
	 * @param country
	 * @param cities
	 */
	public CountryDTO(Country country, Set<City> citiesParam){
		this.id = country.getId();
		this.name = country.getName();
		
		if (citiesParam != null){
			
			cities = new TreeSet<>();			
			country.getCities().forEach((item) -> {
				cities.add(new CityDTO(item));
			});
		}
	}
	
	protected CountryDTO(Country country) {
		this.id = country.getId();
		this.name = country.getName();
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
	 * @return the cities
	 */
	public Set<CityDTO> getCities() {
		return cities;
	}

}
