package com.data.service.DataController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.service.DataService.DataService;
import com.data.service.DataServiceImpl.DataServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/data")
public class DataController {

	private final DataServiceImpl dataServiceImpl;
	
	public DataController(DataServiceImpl dataServiceImpl)
	{
		this.dataServiceImpl=dataServiceImpl;
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getData() throws JsonProcessingException {

		
		String data = dataServiceImpl.getDataFromOtherService();

		return ResponseEntity.ok(data);

	}
	
}
