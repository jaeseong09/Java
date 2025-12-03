package sec02.exam01;

public class Car {
Tire fontLetfTire1 = new HankookTire();
Tire fontRightTire1 = new HankookTire();
Tire backLeftTire1 = new HankookTire();
Tire backRightTire1 = new HankookTire();

void run() {
	fontLetfTire1.roll();
	fontRightTire1.roll();
	backLeftTire1.roll();
	backRightTire1.roll();
	}
}
