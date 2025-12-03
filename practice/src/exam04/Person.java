package exam04;

public class Person {
	public String name;
	public int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	void showInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}
