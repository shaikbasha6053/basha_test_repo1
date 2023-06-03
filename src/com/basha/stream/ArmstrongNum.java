package com.basha.stream;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		int n = 121;
		int r;
		int sum = 0;
		
		int temp = n;
		while(n>0) {
			
			r = n%10;
			sum = (sum * 10) + r;
			n = n/10;
			
		}
		
		if(temp == sum) {
			System.out.println("Given number is armstring");
		}else System.out.println("GIven number not armstring");

	}

}
