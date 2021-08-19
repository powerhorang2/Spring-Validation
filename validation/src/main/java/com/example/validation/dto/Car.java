package com.example.validation.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {

	@NotBlank
	private String name;
	
	@JsonProperty("car_number")
	@NotBlank
	private String carNumber;
	
	@JsonProperty("TYPE")
	@NotBlank
	private String type;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the carNumber
	 */
	public String getCarNumber() {
		return carNumber;
	}

	/**
	 * @param carNumber the carNumber to set
	 */
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", carNumber=" + carNumber + ", type=" + type + "]";
	}

}
