package com.basha.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ForEachDemo {
	
	

	//filter----> Conditional check
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Basha");
		list.add("Shaik");
		list.add("ma");
		list.add("Hussain");
		list.add("Mastan");
		list.add("Apple");
		
		List<String> stringLetters = list.stream().filter(l -> l.length() >= 3).collect(Collectors.toList());
		System.out.println(stringLetters);
		
		for(String st: list) {
			System.out.println(st);
		}
						
		list.stream().forEach(t->System.out.println(t));
		
		Map<Integer, String> map = new  HashMap<>();
		
		map.put(1, "basha");
		map.put(2, "shaik");
		map.put(5, "hussain");
		map.put(8, "mastan");
		map.put(3, "apple");
		
		map.forEach((key,value)->System.out.println(key +": "+value));
		
		map.entrySet().forEach(entry->System.out.println(entry));
		
		Consumer<String> consumer = (t)->System.out.println(t);
		consumer.accept("Basha Shaik");
		System.out.println("---------------");
		for(String t: list) {
			consumer.accept(t);
		}
		
		System.out.println("Filter--------------------");
		for(String st:list) {
			if(st.startsWith("A")) {
				System.out.println(st);
			}
		}
		
		list.stream().filter(st->st.startsWith("A")).forEach(str->System.out.println(str));
		
		map.entrySet().stream().filter(entry->entry.getKey().equals(3)).forEach(entry->System.out.println(entry));
		map.entrySet().stream().filter(entry->entry.getValue().equals("shaik")).forEach(entry->System.out.println(entry));
		map.entrySet().stream().filter(entry->entry.getValue().matches(".*ast.?.n")).forEach(entry->System.out.println(entry));
		
	}
	
	
}
