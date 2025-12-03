package exam03;

public class Car {
	private String model;
	private String color;
	private int year;
	
	public Car() {}
	public Car(String model,String color,int year) {
		this.model=model;
		this.color=color;
		this.year=year;
	}
	
	void showInfo(){
		System.out.println("모델 :" + model);
		System.out.println("컬러 :" + color);
		System.out.println("연도 :" + year);
	}
}
