package exam1020;

public class Tire {
	private String modelName;
	private int maxRevolutions;
	private int revolutions;

	public Tire(String modelName,int maxRevolutions) {
		this.modelName=modelName;
		this.maxRevolutions=maxRevolutions;
		this.revolutions=0;
	}
	public boolean rool(){
		if(revolutions>=maxRevolutions) {
			return false;
		}else {
			revolutions++;
			return true;
		}
	}
	public String getModelName() {
		return modelName;
	}
	public int getMaxRevolutions() {
		return maxRevolutions;
	}
	public int getRevolutions() {
		return revolutions;
	}
	
}
