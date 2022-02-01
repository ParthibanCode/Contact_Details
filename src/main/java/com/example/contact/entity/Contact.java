package com.example.contact.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotNull
	private int houseNum;
	@NotBlank
	private String street;
	@NotBlank
	private String city;
	@NotNull
	private long pin;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@NotNull
	private int age;
	@NotBlank
	private String mobNum1;
	private String mobNum2;
	private String mobNum3;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobNum1() {
		return mobNum1;
	}

	public void setMobNum1(@NotBlank String mobNum1) {
		this.mobNum1 = mobNum1;
	}

	public String getMobNum2() {
		return mobNum2;
	}

	public void setMobNum2(String mobNum2) {
		this.mobNum2 = mobNum2;
	}

	public String getMobNum3() {
		return mobNum3;
	}

	public void setMobNum3(String mobNum3) {
		this.mobNum3 = mobNum3;
	}

}
