package com.basha.stream;

public class FibanaciSeries {

	public static void main(String[] args) {
		
		int x=0,y=1, n=10, z;
		System.out.println(x);
		System.out.println(y);
		
		for (int i = 1; i <= n; i++) {
			z = x + y;
			System.out.println(z);
			x = y;
			y = z;
		}

	}

}
