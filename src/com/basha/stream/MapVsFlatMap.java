package com.basha.stream;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {

		Customer customer = new Customer();
		List<Customer> customerList = customer.getAllCustomers();
		
		//list<Customer> convert to List<String> -> data transformation
		//mapping: customer -> customer.getEmail()
		//customer -> customer.getEmail() one to one mapping -> one customer one email
		List<String> custMailList = customerList.stream().map(Customer::getEmail).collect(Collectors.toList());
		System.out.println(custMailList);
		
		List<String> custNames = customerList.stream().map(cust -> cust.getName()).collect(Collectors.toList());
		System.out.println(custNames);
		
		//customer -> customer.getPhonenumbers() one to many mapping 
		//customer -> customer.getPhonenumbers -> one to many mapping -> one customer having many phone numbers
		List<List<String>> custPhoneNums = customerList.stream().map(cust->cust.getPhonenumbers()).collect(Collectors.toList());
		System.out.println(custPhoneNums);  //non flated data
		
		//list<Customer> convert to List<String> -> data transformation
		//mapping: customer -> customer.getPhonenumbers() 
		//customer -> customer.getPhonenumbers() one to many mapping -> one customer having many phonenumbers
		List<String> custPhonNums = customerList.stream().flatMap(cust->cust.getPhonenumbers().stream()).collect(Collectors.toList());
		System.out.println(custPhonNums);  //flated data
	}

}
