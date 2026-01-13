package com.isrdc.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Property;
import com.isrdc.entities.TaxPayer;
import com.isrdc.repos.TaxPayerRepo;

@Service
public class TaxPayerService {
	@Autowired
	private TaxPayerRepo taxPayerRepo;
	
	public void saveTaxPayerAndProperties() {
		Property property1 = new Property();
		property1.setHouseNo("A-34");
		property1.setArea(5000);
		property1.setCity("Mumbai");
		
		Property property2 = new Property();
		property2.setHouseNo("89/234");
		property2.setArea(12000);
		property2.setCity("Jabalpur");
		
		TaxPayer taxPayer = new TaxPayer();
		taxPayer.setName("Mukund Pathak");
		taxPayer.setEmail("mukund@gmail.com");
		taxPayer.setAadhar("A732ER91");
		
		taxPayer.setProperties(Arrays.asList(property1, property2));
		
		property1.setTaxPayer(taxPayer);
		property2.setTaxPayer(taxPayer);
		
		taxPayerRepo.save(taxPayer);
	}
}
