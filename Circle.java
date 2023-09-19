package shapes;

public class Circle extends Shape {
	private double radius ;
	public Circle (double radius) {
		this.radius = radius;
	}
	@ Override
	public   double CalculateArea () {
		return Math.PI*radius*radius;
	
	
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle circle =new Circle(4);
  
System.out.println("Area of circle:"+  circle.CalculateArea ());

	}
}
	