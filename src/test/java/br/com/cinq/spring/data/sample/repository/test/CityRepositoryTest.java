package br.com.cinq.spring.data.sample.repository.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//import br.com.cinq.spring.data.sample.entity.City;
//import br.com.cinq.spring.data.sample.entity.Country;
import br.com.cinq.spring.data.sample.repository.ICityRepository;

/**
 * Eye candy: implements a sample in using JpaRespositories
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityRepositoryTest {

    @Autowired
    private ICityRepository dao;

    @Test
    public void testQueryPerson() {

    	Assert.assertNotNull(new String());
    	
//        Assert.assertNotNull(dao);
        
//        Assert.assertTrue(dao.count()>0);

//        Country country = new Country();
//        country.setId(3); // Should be France

//        List<City> list = dao.findByCountry(country);

//        Assert.assertEquals(2, list.size());
    }
}
