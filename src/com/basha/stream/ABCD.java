package com.basha.stream;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ABCD {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(10);
		
		System.out.println(set);
		
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(109, "Basha");
		map.put(102, "Shaik");
		map.put(109, "Pakkir");
		
		System.out.println(map);

	}

}
