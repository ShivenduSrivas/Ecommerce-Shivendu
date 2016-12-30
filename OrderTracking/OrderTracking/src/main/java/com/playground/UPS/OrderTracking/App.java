package com.playground.UPS.OrderTracking;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.playground.UPS.tracking.Request;
import com.playground.UPS.tracking.ServiceAccessToken;
import com.playground.UPS.tracking.TrackRequest;
import com.playground.UPS.tracking.TransactionReference;
import com.playground.UPS.tracking.UPSSecurity;
import com.playground.UPS.tracking.UPSTrackRequest;
import com.playground.UPS.tracking.UsernameToken;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App 
{
	private static Logger log = LoggerFactory.getLogger(App.class);
	@RequestMapping(value="/ups/orderStatus", method= RequestMethod.GET)
    public JsonNode getOrderStatus( @RequestParam( value = "orderId", required = true) String orderId) {
		JsonNode responseJson = null;
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://onlinetools.ups.com/rest/Track";
		HttpHeaders headers = new HttpHeaders();
	        headers.add("Content-Type", "application/json");
	        headers.add("Accept", "application/json");
	    
	        UPSTrackRequest upsRequest = new UPSTrackRequest();
	      
	        
	        UPSSecurity upsSecurity = new UPSSecurity();
	        UsernameToken usernameToken = new UsernameToken();
	        usernameToken.setUsername("anuragk12");
	        usernameToken.setPassword("Ican2012");
	        upsSecurity.setUsernameToken(usernameToken);
	        ServiceAccessToken serviceAccessToken = new ServiceAccessToken();
	        serviceAccessToken.setAccessLicenseNumber("3D1BC47C36C4D358");
	        upsSecurity.setServiceAccessToken(serviceAccessToken);
	        
	        upsRequest.setUPSSecurity(upsSecurity);
	        
	        TrackRequest trackRequest = new TrackRequest();
	        Request request = new Request();
	        request.setRequestOption("1");
	        TransactionReference transactionReference = new TransactionReference();	        
	        transactionReference.setCustomerContext("Testing API");
	        request.setTransactionReference(transactionReference);
	        trackRequest.setRequest(request);
	        trackRequest.setInquiryNumber(orderId);
	        
	        upsRequest.setTrackRequest(trackRequest);
	        
	        ObjectMapper mapper = new ObjectMapper();
	        
	        try {
				log.info("####Request##### : \n" + mapper.writeValueAsString(upsRequest));
			     HttpEntity<String> entity = new HttpEntity<String>(mapper.writeValueAsString(upsRequest),headers);
			        
			     HttpEntity response	 = restTemplate.exchange(url,HttpMethod.POST, entity, String.class);
			     log.info("####response##### : \n" + response.getBody().toString());
			     
			     responseJson =  mapper.readTree(response.getBody().toString());
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        

	        
	   

	        
        return responseJson;
    }
	public static void main( String[] args )
    {
		 SpringApplication.run(App.class, args);
    }
}
