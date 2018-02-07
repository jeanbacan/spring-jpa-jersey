package br.com.cinq.spring.data.sample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	private String name;
	
	protected Country() {
	}

	public Country(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("id=%d name=%s", id, name);
	}
}
