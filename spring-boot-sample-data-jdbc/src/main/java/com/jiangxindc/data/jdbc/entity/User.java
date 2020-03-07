
package com.jiangxindc.data.jdbc.entity;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

/**
 * @author AnQi
 */
public class User {

	@Id
	private Long id;

	private String firstName;

	private LocalDate dateOfBirth;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LocalDate getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
