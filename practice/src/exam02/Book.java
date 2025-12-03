package exam02;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book() {
	}
	
	public Book(String title,String author,int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	void showInfo() {
		System.out.println("책제목 :" + title);
		System.out.println("저자 :" + author);
		System.out.println("가격 :" + price);
	}
}
