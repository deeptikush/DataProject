package com.data.service.DataService;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public interface DataService {
	
	public String getDataFromOtherService() throws JsonProcessingException;
	
	public String saveItems();
	
}
