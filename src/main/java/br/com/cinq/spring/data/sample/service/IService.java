package br.com.cinq.spring.data.sample.service;


/**
 * Here goes Business logic that are non model validation. eg. map our model
 * @author Jean Bacan
 * T model
 * D dto
 */
public interface IService<T, D> {

	/**
	 * Get dto object
	 * @param model
	 * @return
	 */
	D toDTO(T model);
	
	/**
	 * @param dto
	 * @return
	 */
	T toModel(D dto);
	
}
