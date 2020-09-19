package com.assignment.customermanagement.entities;

import javax.persistence.Embeddable;

import lombok.Data;

/**
 * @author hemanshu.banga
 *
 */

@Data
@Embeddable
public class AddressEntity {
	
	private String houseNumber;
	
	private String street;
	
	private String city;
	
	private String province;
	
	private String country;
	
	private String pinCode;

}
