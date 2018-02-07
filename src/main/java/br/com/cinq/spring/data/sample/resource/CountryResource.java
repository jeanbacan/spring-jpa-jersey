package br.com.cinq.spring.data.sample.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryResource {

	  @RequestMapping(method=RequestMethod.GET)
	  public String getHello(){
		  return "Country";
	  }
}
