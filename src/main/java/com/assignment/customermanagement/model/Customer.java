package com.assignment.customermanagement.model;

import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.assignment.customermanagement.entities.AddressEntity;

import lombok.Data;

/**
 * @author hemanshu.banga
 *
 */

@Data
public class Customer {
	
	private UUID customerId;
	
	@NotBlank(message = "Firstname is required")
	private String firstName;
	@NotBlank(message = "Lastname is required")
	private String lastName;
	@Positive(message = "Age should be greater than 0")
	private int age;
	@NotNull(message = "Address is required")
	@Valid 
	private AddressEntity address;
	 
}
