package com.basha.stream;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private long salary;
		
	public Employee() {
	}

	public Employee(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public List<Employee> getEmployees(){
		Employee employee1 = new Employee(106, "Basha", 60000);
		Employee employee2 = new Employee(108, "Shaik", 80000);
		Employee employee3 = new Employee(103, "Ravi", 30000);
		Employee employee4 = new Employee(102, "Hussain", 10000);
		Employee employee5 = new Employee(101, "Sunil", 90000);
		
		List<Employee> studentList = new ArrayList<>();
		studentList.add(employee1);
		studentList.add(employee2);
		studentList.add(employee3);
		studentList.add(employee4);
		studentList.add(employee5);
		return studentList;
	}
	
}
