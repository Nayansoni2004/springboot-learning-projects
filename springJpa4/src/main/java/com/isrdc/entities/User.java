package com.isrdc.entities;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@DynamicInsert
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	@Column(name = "user_name", length=45, nullable=false)
//	@Column(name="user_name", columnDefinition= "varchar(45) not null")
	private String name;
	
	@Column(name = "user_email", length=200, nullable=false, unique=true)
//	@Column(name="user_email", columnDefinition = "varchar(150) not null unique")
	private String email;
	
	@Column(name = "user_password", columnDefinition="varchar(16)")
	@ColumnDefault("1234567")
	private String password;
	
	
//	###############getter setters#####################
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
