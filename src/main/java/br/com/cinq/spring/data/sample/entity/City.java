package br.com.cinq.spring.data.sample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Model representation of City
 * @author Pichau
 *
 */
@Entity
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Country country;
	
	private String name;
	
	protected City() {
		// TODO Auto-generated constructor stub
	}
	
	public City(Country country, String name) {
		this.country = country;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("id=%d name=%s countryName=%s", id, name, country.toString());
	}
	
}
