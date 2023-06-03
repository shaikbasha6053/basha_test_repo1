package com.basha.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Mastan", 800);
		map.put("Shaik", 300);
		map.put("Basha", 600);
		map.put("Apple", 500);
		map.put("Mango", 900);
		//Asc
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("---------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		//Desc
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
		Map<Employee, Integer> employeeMap = new HashMap<>();
		Employee employee1 = new Employee(106, "Basha", 60000);
		Employee employee2 = new Employee(108, "Shaik", 80000);
		Employee employee3 = new Employee(103, "Ravi", 30000);
		Employee employee4 = new Employee(102, "Hussain", 10000);
		Employee employee5 = new Employee(101, "Sunil", 90000);
		employeeMap.put(employee1, 60);
		employeeMap.put(employee2, 20);
		employeeMap.put(employee3, 10);
		employeeMap.put(employee4, 40);
		employeeMap.put(employee5, 50);
		
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);
		System.out.println("--------------");
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
			.forEach(System.out::println);
		
	}

}
