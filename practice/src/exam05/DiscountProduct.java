package exam05;

public class DiscountProduct extends Product{
	public int discountRate;
	public DiscountProduct(String name,int price,int discountRate) {
		super(name,price);
		this.discountRate=discountRate;
	}
	
	@Override
	public int getPrice() {
		return (int)(price * (1 - discountRate / 100.0));
	}
	
	@Override
	void showInfo() {
		System.out.println("이름 : "+name);
		System.out.println("가격  : "+price);
		System.out.println("할인가  : "+ getPrice());
	}
	
}
