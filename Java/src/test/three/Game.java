package test.three;

public class Game {

	public static void main(String[] args) {
		AbstrctMonster m1 =  new Attacker();
		AbstrctMonster m2 = new Defander();
		
		m1.defense(m2.attack());
		m2.defense(m1.attack());
		
		System.out.println("Attack:"+m1.hp);
		System.out.println("Defender"+m2.hp);

	}

}
