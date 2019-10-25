package com.hcl.accounts;

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
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class BankAccountserviceApplicationTests {
	 @LocalServerPort
	    int randomServerPort;

	 @Test
	    public void testApplyLoan() throws URISyntaxException 
	    {
	        RestTemplate restTemplate = new RestTemplate();
	        
	        final String baseUrl = "http://localhost:"+randomServerPort+"/loan/apply";
	        
	        ApplyLoan al=new ApplyLoan(2,"Anubhav",1000,"Land",1,100);
	        URI uri = new URI(baseUrl);
	        try {
	            ResponseEntity<String> result = restTemplate.postForEntity(uri, al,String.class);
	            //Verify request succeed
	            
	            Assert.assertEquals(200, result.getStatusCodeValue());
	            Assert.assertEquals(true, result.getBody().contains("Application has been submitted"));
	            }  catch(HttpClientErrorException ex)  {
	            	System.out.println(ex.getRawStatusCode());
	                //Verify bad request and missing header
	                Assert.assertEquals(404, ex.getRawStatusCode());
	            }
	            //Verify request succeed
	          
	        }

}
