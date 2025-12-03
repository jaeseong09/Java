package exam01;

public class Student {
	private String name;
	private int grade;
	private double score;
	
	public Student() {
		this.name="이름 없음";
		this.grade=1;
		this.score=0;
	}
	
	public Student(String name,int grade,double score) {
		this.name=name;
		this.grade=grade;
		this.score=score;
	}
	
	void showInfo() {
		System.out.println("이름 : " + name );
		System.out.println("학년 : " + grade );
		System.out.println("점수 : " + score );
	}
	
}
