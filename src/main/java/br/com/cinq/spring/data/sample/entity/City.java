package br.com.cinq.spring.data.sample.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Model representation of City
 * 
 * @author Pichau
 *
 */
@Entity
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "country_id")
	private Country country;

	private String name;

	protected City() {
		// TODO Auto-generated constructor stub
	}

	public City(Long id, String name, Country country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("id=%d name=%s countryName=%s", id, name, country.toString());
	}

}
