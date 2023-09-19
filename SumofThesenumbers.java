package javaexercise;

import java.util.Scanner;

public class SumofThesenumbers {

	public SumofThesenumbers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		int count, numbers = 0;
System.out.println("Enter the count of numbers");
		count = sc.nextInt();
		System.out.println("Enter the  numbers");
		
		int sum =0 ;
		for (int i=0; i<count; i++) {
			numbers = sc.nextInt();
			sum = numbers + sum;
			}
		
		System.out.println("sum of these numbers +" +" " +sum);
	}

}
