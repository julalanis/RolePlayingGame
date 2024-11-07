package mypackage;

public class Hero extends RolePlayingGame{
	String name = null;
	int healthPoints = 10;
	int attackPower = 2;
	
	public Hero() {
	
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return healthPoints;
	}
	
	public int getAttack() {
		return attackPower;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setHealth(int newHealth) {
		this.healthPoints = newHealth;
	}
	
	public void setAttack(int newAttack) {
		this.attackPower = newAttack;
	}
	
	public String toString() {
		return "This hero's name is: " + name
				+ "\nHP: " + healthPoints +
				"\nAttack: " + attackPower;
	}
	

}
