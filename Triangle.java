package shapes;

public class Triangle extends Shape {
	private double base;
	private double height;
	
	public Triangle (double base, double height) {
		this.base =base;
		this.height = height;
	}
	@Override
	public double CalculateArea() {
		return 0.5*base*height;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle =new Triangle (5,9);
		  
		 System.out.println("Area of triangle:"+  triangle.CalculateArea ());

		 	}
		 
		 	
} 


