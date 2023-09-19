package javaexercise;

public class PascalTrianglePattern {

	public PascalTrianglePattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=0; i<=4; i++) {
	for (int sp=1; sp<4-i;sp++) {
		System.out.print(" ");
	}
	int number =1;
	for( int k=0;k<=i; k++) {
		System.out.print(number+ " ");
		number =number*(i-k)/(k+1);  
	}
	System.out.println();
	}
	}        

}

