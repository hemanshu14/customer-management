package com.assignment.customermanagement.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

/**
 * @author hemanshu.banga
 *
 */

@Entity
@Data
@Table(name = "customers")
public class CustomerEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "customerId")
	private UUID customerId;
	
	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "age")
	private int age;

	@Embedded
	private AddressEntity address;

	@CreationTimestamp
	@Column(name = "creationTime")
	private LocalDateTime createdTime;

	@UpdateTimestamp
	@Column(name = "updateTime")
	private LocalDateTime updatedTime;

}
