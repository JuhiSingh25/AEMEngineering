package com.test.AEM.EngineeringTest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.test.AEM.EngineeringTest.Entity.IntergerToRoman;

// the controller class that will get executed when we call the GET API
// added error handling here according to the extensions provided

@RestController
public class IntegertoRomanController {

	@GetMapping("v1/integertToRoman/{IntegerNumber}")
	public IntergerToRoman romanNumeral(@PathVariable Integer IntegerNumber) {

		if (IntegerNumber < 1 || IntegerNumber > 3999) 
		{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
					"Enter an Integer between 1 and 3999");
		}
		return new IntergerToRoman(IntegerNumber);

	}

}