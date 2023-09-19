package javaexercise;

import java.util.Scanner;

public class AverageofNumbers {

	public AverageofNumbers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count, numbers = 0;
		System.out.println("Enter the count of numbers");
		Scanner sc =new Scanner (System.in);
				count = sc.nextInt();
				System.out.println("Enter the  numbers");
				float average = 0;
				int sum =0 ;
				for (int i=0; i<count; i++) {
					numbers = sc.nextInt();
					sum = numbers + sum;
					
					average = sum/count;
					}
				
				System.out.println("Average of these numbers "+ "=" +average);
			}

	}


