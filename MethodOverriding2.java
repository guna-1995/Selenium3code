package javaexercise;

public class MethodOverriding2 extends MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverriding2 me=new MethodOverriding2 () ;
me.calculation( ) ;

	}
	public void calculation( ) {
		int a= 20;
		int b=10;

		int c=a+b;
		int c1=a-b;
		System.out.println(c);
		System.out.println(c1);
		super.calculation();
	}
}
