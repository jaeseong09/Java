package exam06;

public class Rectangle extends Shape{
	double width;
	double height;
	public Rectangle(String name,double width,double height) {
		super(name);
		this.width=width;
		this.height=height;
	}
	
	public double area(){
		double result=width * height;
		System.out.println(result);
		return result;
		
	}
}
