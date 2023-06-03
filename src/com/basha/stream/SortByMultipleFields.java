package com.basha.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByMultipleFields {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee(101, "Basha", 20000));
		employeeList.add(new Employee(101, "Apple", 30000));
		employeeList.add(new Employee(101, "Basha", 10000));
		employeeList.add(new Employee(102, "Shaik", 40000));
		employeeList.add(new Employee(103, "Pakkir", 50000));
		employeeList.add(new Employee(103, "Pakkir", 45000));
		
		Comparator<Employee>  compareById = Comparator.comparing(Employee::getId);
		Comparator<Employee> compareByName = Comparator.comparing(Employee::getName);
		Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);
		
		employeeList.stream().sorted(compareById.thenComparing(compareByName).thenComparing(compareBySalary)).forEach(emp->System.out.println(emp));
	}

}
