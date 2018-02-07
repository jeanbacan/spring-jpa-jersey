package br.com.cinq.spring.data.sample.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityResource {

	  @RequestMapping(path="/", method=RequestMethod.GET)
	  public String getHello(){
		  return "";
	  }
}
