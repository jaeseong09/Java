package exam06;

public class Circle extends Shape{
	public  double radius;
	public Circle(String name,double radius) {
		super(name);
		this.radius=radius;
	}
	
	@Override
	public double area() {
		double result = 3.14*radius*radius;
		System.out.println(result);
		return result ;
	}
}
