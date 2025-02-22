package com.eg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eg.demo.service.SimpleInterestImp;
//import com.eg.demo.service.SimpleInterestService;

@RestController
public class SimpleInterestController {
	@Autowired
	SimpleInterestImp simpleInterestImp;
	
	
	@GetMapping("/get/interest")
	public double getInterest() {
		double result=simpleInterestImp.calculateSimpleInterest(25000.8,2.0,1);
		return result;
		
		
	}
	

}
