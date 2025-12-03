package sec02.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();

		myCar.fontLetfTire1 = new KumhoTire();
		myCar.fontRightTire1 = new KumhoTire();
		myCar.run();
	}
}
