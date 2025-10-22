package exam1020;

public class WideTire extends Tire{
	private int width;
	
	public WideTire(String modelName,int maxRevolutions,int width) {
		super(modelName, maxRevolutions);
		this.width=width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
}
