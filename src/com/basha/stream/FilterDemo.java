package com.basha.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		Employee st = new Employee();
		List<Employee> employeeList = st.getEmployees();
		//System.out.println(employeeList);
		
		employeeList.stream().filter(emp->emp.getSalary()>50000).forEach(emp->System.out.println(emp));
		List<Employee> employee = employeeList.stream().filter(emp->emp.getSalary()<50000).collect(Collectors.toList());
		System.out.println(employee);
		
		
	}

}
