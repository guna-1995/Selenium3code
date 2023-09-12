package javaexercise;

public class Fibanocciseries {

	

	public static void main(String[] args) {
		
		
		int n=30 ;
int a=0;
int b=1;

System.out.print(a+ " " +b+ " ");


 for (int i=3; i<=n; i++) {
	 int c=a+b;
	 a=b;
	 b=c;
	 System.out.print(c+ " ");
	 
 }

	}

}
