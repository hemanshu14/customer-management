package com.assignment.customermanagement.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * @author hemanshu.banga
 *
 */

@Data
public class Address {

	@NotBlank(message = "House number is required")
	private String houseNumber;

	@NotBlank(message = "Street is required")
	private String street;

	@NotBlank(message = "City is required")
	private String city;

	@NotBlank(message = "Province is required")
	private String province;

	@NotBlank(message = "Country is required")
	private String country;

	@NotBlank(message = "Pincode is required")
	private String pinCode;
}
