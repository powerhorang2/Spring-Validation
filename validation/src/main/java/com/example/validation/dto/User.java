package com.example.validation.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

public class User {

	@NotBlank
	private String name;

	@Max(value = 90)
	private int age;

	@Valid
	private List<Car> cars;

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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the cars
	 */
	public List<Car> getCars() {
		return cars;
	}

	/**
	 * @param cars the cars to set
	 */
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}

}
