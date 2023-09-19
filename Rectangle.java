package shapes;

public class Rectangle extends Shape {
	private double width;
	private double height;
	public Rectangle ( double width , double height) {
		this.width =width;
		this.height = height;
	}
@Override
public double CalculateArea () {
	return width*height;
}

	public static void main(String[] args) {
		 Rectangle rectangle =new Rectangle(12,34);
		  
		 System.out.println("Area of Rectangle:"+  rectangle.CalculateArea());

		 	}
		 }
		 	