package test.three;

public abstract class AbstrctMonster {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	protected AbstrctMonster(String name,int hp,int attack,int defense) {
		this.name=name;
		this.hp=hp;
		this.attack=attack;
		this.defense=defense;
	}
	
	public boolean defense(int Attack){
		if(defense >Attack) {
			return true;
		} else {
			int damage = Attack - defense;
			hp -= damage;
			return false;
		}
	}
	
	public abstract int attack();
}