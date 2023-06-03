package com.basha.stream;

import java.security.Identity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SortingEx {

	public static void main(String[] args) {
		
		
		Integer arr[] = {6,8,5,4,2,1,9};
		int index = Arrays.asList(arr).indexOf(9);
		System.out.println(index);
		
		int indexof = 2;		
		System.out.println(IntStream.range(0, arr.length).filter(x -> indexof == arr[x]).findFirst().orElse(-1));
		
		String str = "My name is basha shaik basha is name";
		String[]  straArray = str.split(" ");
		Map<String, Long> wordCunt = Arrays.asList(straArray).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(wordCunt);

		System.out.println("============================");
		
		
		Student student1 = new Student(106, "Basha", 60000);
		Student student2 = new Student(108, "Shaik", 80000);
		Student student3 = new Student(103, "Ravi", 30000);
		Student student4 = new Student(102, "Hussain", 10000);
		Student student5 = new Student(101, "Sunil", 90000);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		List<Integer> list = Arrays.asList(5,8,2,4,7);
		
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		System.out.println(list.stream().collect(Collectors.averagingInt(Integer::intValue)));
		System.out.println(list.stream().collect(Collectors.summingInt(Integer::intValue)));
		System.out.println(list.size());
		
		//System.out.println(list.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList()));
		//System.out.println(list.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList()));
		
		List<Student> stuAsclist = studentList.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
		System.out.println("stuAsclist : "+stuAsclist);
		
		List<Student> stuDsclist = studentList.stream().sorted(Comparator.comparingInt(Student::getId).reversed()).collect(Collectors.toList());
		System.out.println("stuDsclist : "+stuDsclist);
		
		
		//Ascending
		List<Student> sortAscList = studentList.stream().sorted((s1,s2)->s1.getId() - s2.getId()).collect(Collectors.toList());
		System.out.println(sortAscList);
		//Decending
		List<Student> sortDescList = studentList.stream().sorted((s1,s2)->s2.getId() - s1.getId()).collect(Collectors.toList());
		System.out.println(sortDescList);
		
		List<Student> stuList = studentList.stream().filter(stu -> stu.getSalary() < 60000).collect(Collectors.toList());
		System.out.println(stuList);
		
		//remove duplicate
		List<Long> distintSalary = studentList.stream().map(Student::getSalary).distinct().collect(Collectors.toList());
		System.out.println(distintSalary);
		
		//long salCount = studentList.stream().map(Student::getSalary).count();
		Double salAvg1 = studentList.stream().collect(Collectors.averagingDouble(Student::getSalary));
		System.out.println("salCount"+ salAvg1);
		
		//Double salAvg = studentList.stream().mapToDouble(Student::getSalary).average().getAsDouble();
		//System.out.println("salAvg"+salAvg);
		
		Double totalSalary = studentList.stream().collect(Collectors.summingDouble(Student::getSalary));
		System.out.println("totalSalary"+totalSalary);
		Long totalSalary2 = studentList.stream().collect(Collectors.summingLong(Student::getSalary));
		System.out.println("totalSalary"+totalSalary2);
		
		
		Optional<Student> maxSalary = studentList.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getSalary)));
		Student st = maxSalary.get();
		System.out.println("Heiest Salary Student: "+st);
		
		Optional<Student> minSalStudent = studentList.stream().collect(Collectors.minBy(Comparator.comparing(Student::getSalary)));
		Student minSalStu = minSalStudent.get();
		System.out.println(minSalStu);
		
		Optional<Student> secondHighSalary = studentList.stream().sorted(Comparator.comparing(Student::getSalary).reversed()).skip(1).findFirst();
		Student secondHighSalStu = secondHighSalary.get();
		System.out.println("Second High Salary Student: "+secondHighSalStu);
		
		long stuCount = studentList.stream().filter(stu->stu.getSalary() < 60000).count();
		System.out.println(stuCount);
		
		Map<String, Long> studentmap = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getSalary));
		System.out.println(studentmap);
		
		Map<Integer, String> studentMap = studentList.stream().collect(Collectors.toMap(Student::getId, Student::getName));
		System.out.println(studentMap);
		
		Map<Integer, List<Student>> stuGropMap = studentList.stream().collect(Collectors.groupingBy(Student::getId));
		System.out.println(stuGropMap);
	}

	
}