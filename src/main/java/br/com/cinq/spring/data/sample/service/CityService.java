package br.com.cinq.spring.data.sample.service;

import br.com.cinq.spring.data.sample.dto.CityDTO;
import br.com.cinq.spring.data.sample.dto.CountryDTO;
import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.entity.Country;

/**
 * Here goes Business logic that are non model validation. eg. map our model
 * added behavior to get model/vos
 * @author Jean Bacan
 *
 */
public class CityService implements IService<City, CityDTO> {

	
	
	/* (non-Javadoc)
	 * @see br.com.cinq.spring.data.sample.service.IService#toDTO(java.lang.Object)
	 */
	@Override
	public CityDTO toDTO(City model) {
		//Could use CommonBeansUtils or Dozer. Constructor works for now
		return new CityDTO(model, model.getCountry());
		
	}

	/* (non-Javadoc)
	 * @see br.com.cinq.spring.data.sample.service.IService#toModel(java.lang.Object)
	 */
	@Override
	public City toModel(CityDTO dto) {
		//Could use CommonBeansUtils or Dozer. Constructor works for now
		CountryDTO countryDTO = dto.getCountry();
		return new City(dto.getId(), dto.getName(), new Country(countryDTO.getId(), countryDTO.getName(), null));
	}

}
