package javaexercise;

public class PalindromNumber {
  
	

	public static void main(String[] args) {
	
		int n=1234;
		
		int no1=n;
		
		int rev =0;
		while (n>0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
if (no1==rev) {
	System.out.println(rev + "   is  a palindrome");
}
else  {
	
	System.out.println(rev +"  is not a palindrome");
} 

}
}

   