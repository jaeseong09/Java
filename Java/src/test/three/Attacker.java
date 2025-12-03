package test.three;

public class Attacker extends AbstrctMonster{
	public Attacker() {
		super("Attacker", 30, 20, 10);
	}
	
	@Override
	public int attack() {
		System.out.println("Attacker - Very Strong Attack");
		return attack;
	}
}