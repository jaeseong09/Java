package exam04;

public class Student extends Person{
	public String schoolName;
	public Student(String name,int age,String schoolName) {
		super(name,age);
		this.schoolName=schoolName;
	}
	
	@Override
	void showInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("학교이름  : "+schoolName);
	}
}
