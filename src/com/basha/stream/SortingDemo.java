package com.basha.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5,8,2,4,7);
		List<String> stringList = Arrays.asList("Basha","Shaik","Apple","Mango");
		
		Integer count = list.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("list count: " +count);
		
		Integer doubleSum = list.stream().filter(l->l%2 ==0).map(k->k*k).collect(Collectors.summingInt(Integer::intValue));
		System.out.println("doubleSum: " +doubleSum);
		
		Collections.sort(list);  //Assending
		System.out.println(list);
		Collections.reverse(list); //Decending
		System.out.println(list);
		
		Collections.sort(stringList); //Assending
		System.out.println(stringList); 
		Collections.reverse(stringList);  //Decending
		System.out.println(stringList);  
		
		list.stream().sorted().forEach(li->System.out.println(li));
		list.stream().sorted(Comparator.reverseOrder()).forEach(li->System.out.println(li));
		
		Employee employee = new Employee();
		List<Employee> empList = employee.getEmployees();
		empList.stream().sorted((e1,e2)->(int) e1.getSalary() - (int)e2.getSalary()).forEach(emp->System.out.println(emp));
		List<Employee> emps = empList.stream().sorted((emp1,emp2)-> (int)emp2.getSalary() - (int)emp1.getSalary()).collect(Collectors.toList());
		System.out.println(emps);
		
		List<Employee> empls = empList.stream().sorted(Comparator.comparing(emp->emp.getSalary())).collect(Collectors.toList());
		System.out.println(empls);
		
		List<Employee> empLs = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println(empLs);
		
		
		List<Employee> empListDec = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(empListDec);
	}

}
