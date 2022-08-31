package com.infytel.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infytel.dto.SimDetailsDTO;
import com.infytel.dto.SimOffersDTO;

import com.infytel.exceptions.SimActiveException;
import com.infytel.exceptions.SimDetailsWrongException;
import com.infytel.service.SimDetailsService;

@RestController
@RequestMapping("/sim")
public class SimDetailsController {
	
	@Autowired
	SimDetailsService simDetailsService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/details")
	public ResponseEntity<List<SimOffersDTO>> validateSim(@Valid @RequestBody SimDetailsDTO simDetails)
			throws SimDetailsWrongException, SimActiveException{
			
		SimDetailsDTO simDetailsDTO = simDetailsService.validateDetailsByServiceAndSimNumber(simDetails.getServiceNumber(), simDetails.getSimNumber());
		
		
		
		if(simDetailsDTO != null) {
			
			@SuppressWarnings("unchecked")
			List<SimOffersDTO> simOffersDTOs = restTemplate.getForObject("http://localhost:9200/offers/" + simDetailsDTO.getSimId() , List.class);
			return ResponseEntity.status(HttpStatus.OK).body(simOffersDTOs);
		}
		
		return null;
		//return ResponseEntity.status(HttpStatus.OK).body();
	}
	
}
