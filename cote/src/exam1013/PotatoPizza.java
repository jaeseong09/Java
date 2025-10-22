package exam1013;

public class PotatoPizza extends Pizza{

	public PotatoPizza() {
		this("M");
	}
	public PotatoPizza(String size) {
		this.name="감자";
		this.size=size;
		this.prices =new int[] {13000, 18000, 29000};
		this.toppings="Potato";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings+"을 추가합니다.");
		super.cook();
	}
}



