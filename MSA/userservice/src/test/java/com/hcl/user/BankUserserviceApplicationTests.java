package com.hcl.user;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BankUserserviceApplicationTests {

	@LocalServerPort
	int randomServerPort;
	
	@Test
	public void testGetUser()  throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		
		    final String baseUrl = "http://localhost:" + randomServerPort + "/user/getUser/Janani";
		    URI uri = new URI(baseUrl);
			ResponseEntity<User> result = restTemplate.getForEntity(uri, User.class);
   			Assert.assertEquals(200, result.getStatusCodeValue());
			

		
		
	}


	@Test
	public void testRegisterUser() throws URISyntaxException {
		   RestTemplate restTemplate = new RestTemplate();
		
		    final String baseUrl = "http://localhost:" + randomServerPort + "/user/registerUser";
		    User user  = new User();
		    user.setCity("delhi");
		    user.setCountry("India");
		    URI uri = new URI(baseUrl);
			ResponseEntity<String> result = restTemplate.postForEntity(uri, user,String.class);
   			Assert.assertEquals(200, result.getStatusCodeValue());
			
	}
} 











