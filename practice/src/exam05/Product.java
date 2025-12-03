package exam05;

public class Product {
	public String name;
	public int price;
	
	public Product(String name,int price) {
		this.name=name;
		this.price=price;
	}

	public int getPrice() {
		return price;
	}
	void showInfo() {
		System.out.println("이름 : "+name);
		System.out.println("가격  : "+price);
	}
}
