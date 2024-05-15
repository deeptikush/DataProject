package com.data.service.DataServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.data.service.Config.MicroserviceConfig;
import com.data.service.DataEntity.Item;
import com.data.service.DataService.DataService;
import com.data.service.response.ItemResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class DataServiceImpl implements DataService {
   
	private final MicroserviceConfig microserviceConfig;
	 RestTemplate restTemplate = new RestTemplate();
	
	public DataServiceImpl(MicroserviceConfig config )
	{
		this.microserviceConfig= config;
		
	}
	 
	 
	 
	
	@Override
	public String getDataFromOtherService() throws JsonProcessingException {
		
		String data = restTemplate.exchange(microserviceConfig.getUrl(), HttpMethod.GET, headers(), String.class).getBody();
		
		return data;
		
	}
	
	
	
	 private  HttpEntity<String> headers() { 
		 
           
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + microserviceConfig.getToken());

			HttpEntity<String> request = new HttpEntity<String>(headers);
	  return request; 
	  
	 }




	@Override
	public String saveItems() {
		
		ResponseEntity<ItemResponse> data = restTemplate.exchange(microserviceConfig.getUrl(), HttpMethod.GET, headers(), ItemResponse.class);
		
		if(data.getStatusCode().is2xxSuccessful())
		{
			ItemResponse itemResponse= data.getBody();
			
			ItemResponse response = new ItemResponse();
			
			response.setItems(itemResponse.getItems());
			
			
		}
		
		return null;
	}

}
