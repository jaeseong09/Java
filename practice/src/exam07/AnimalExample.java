package exam07;

public class AnimalExample {

	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Dog("뽀삐");
		animal[1] = new Cat("나비");
		animal[2] = new Dog("초코");
		
		for(Animal ani : animal) {
			ani.sound();
		}
	
	}

}
