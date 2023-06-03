package com.basha.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
	
	private int id;
	private String name;
	private String email;
	private List<String> phonenumbers;
	
	
	public Customer() {
	}


	public Customer(int id, String name, String email, List<String> phonenumbers) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phonenumbers = phonenumbers;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public List<String> getPhonenumbers() {
		return phonenumbers;
	}


	public void setPhonenumbers(List<String> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}

	public List<Customer> getAllCustomers(){
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer(101, "Basha", "abc@gmail.com", Arrays.asList("9740103532","9966605378")));
		customerList.add(new Customer(102, "Shaik", "grd@gmail.com", Arrays.asList("9885616773","9895969785")));
		customerList.add(new Customer(108, "Apple", "mrp@gmail.com", Arrays.asList("8861676611","9966625898")));
		customerList.add(new Customer(107, "Mango", "cyd@gmail.com", Arrays.asList("9885989885","9740106561")));
		customerList.add(new Customer(100, "India", "spy@gmail.com", Arrays.asList("8798516165","8741589623")));
		return customerList;
	}
	
}
