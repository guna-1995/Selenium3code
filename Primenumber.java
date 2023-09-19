package javaexercise;

public class Primenumber {

	public Primenumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		for(i=50; i<=150; i++) {
			for (j=2; j<i; j++) {
				if(i%j==0)
					break;
			}
			if (i==j)
			{
				System.out.print(i+  " ");
			}
		}
	}

} 
