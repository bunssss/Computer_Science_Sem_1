package pkg;
import java.util.Scanner;
import java.util.Random;


public class Sorcerer {

	Random rand = new Random();
	
	String name;
	int health = rand.nextInt(14)+1; 
	int attack = rand.nextInt(14)+1;

	public Sorcerer() {
		name = "Sorcerer";
		
	}
	
	public Sorcerer(String name) {
		name = this.name;
	}
	
	public void setHealth(int health) {
		health = this.health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getName() {
		return name;
	}
	
	public void attack(Warrior a) {
		int atk = rand.nextInt(attack)+1;
		a.getHealth() = a.getHealth() - atk;
	}
}

