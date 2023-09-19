package javaexercise;

public class StringProgram {

	public StringProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Guna";
System.out.println(s.hashCode() );   
String s1="Guna";
System.out.println(s1.indexOf(s1));
System.out.println(s1.charAt(3));
System.out.println(s1.contains("a"));
 StringBuffer bf = new StringBuffer ("congratulation");
 StringBuilder bd = new StringBuilder ("congratulation");
 System.out.println(bd.length() );   
 System.out.println(bf.replace(2,5,s1) );
 System.out.println(bd.reverse() );   

	}


	}

