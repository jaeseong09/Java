package test.three;

public class Defander extends AbstrctMonster{
	public Defander() {
		super("Defander", 20, 13, 25);
	}
	
	@Override
	public int attack() {
		System.out.println("Defander - Attack");
		return attack;
	}
}