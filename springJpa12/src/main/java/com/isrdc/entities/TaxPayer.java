package com.isrdc.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tax_payers")
public class TaxPayer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taxPayerId;
	
	private String name;
	private String email;
	private String aadhar;
	
	@OneToMany(mappedBy = "taxPayer", cascade = CascadeType.ALL)
	private List<Property> properties;

	public Integer getTaxPayerId() {
		return taxPayerId;
	}

	public void setTaxPayerId(Integer taxPayerId) {
		this.taxPayerId = taxPayerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
}
