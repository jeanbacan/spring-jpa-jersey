package br.com.cinq.spring.data.sample.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Model representation of County
 * @author Pichau
 *
 */
@Entity
public class Country {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToMany(mappedBy="country", cascade=CascadeType.ALL)	
	private Set<City> cities;
	
	private String name;

	protected Country() {
	}

	public Country(Long id, String name, Set<City> cities) {
		this.id = id;
		this.name = name;
		this.cities = cities;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	
	/**
	 * @return the cities
	 */
	public Set<City> getCities() {
		return cities;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("id=%d name=%s", id, name);
	}
}
