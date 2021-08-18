package com.example.validation.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.example.validation.annotation.YearMonth;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	@NotBlank
	private String name;

	@Max(value = 90)
	private int age;

	@Email
	private String email;

	@JsonProperty("phone_number")
	@Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다. 01x-xxx(x)-xxxx")
	private String phoneNumber;

	@YearMonth(pattern = "yyyyMMdd")
	private String reqYearMonth; // yyyyMM

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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the reqYearMonth
	 */
	public String getReqYearMonth() {
		return reqYearMonth;
	}

	/**
	 * @param reqYearMonth the reqYearMonth to set
	 */
	public void setReqYearMonth(String reqYearMonth) {
		this.reqYearMonth = reqYearMonth;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", reqYearMonth=" + reqYearMonth + "]";
	}

}
