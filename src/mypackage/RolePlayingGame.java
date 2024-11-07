package mypackage;

import java.util.Scanner; 

public class RolePlayingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Hero player1 = new Hero(null);
		
		System.out.print("Please enter your hero's name: ");
		String newName = input.nextLine();
		player1.setName(newName);
		System.out.println("\n" + player1.toString());
		
		System.out.print("\nYou can have a sword or a dagger, which would you like?: ");
		int sword = 3;
		int dagger = 2;
		String weaponType = input.nextLine();
		
		if (weaponType.equalsIgnoreCase("Sword")) {
			player1.setAttack(player1.getAttack() + sword);
			System.out.println("You chose the " + weaponType + ". Your attack power is now " + player1.getAttack());
			
		} else if (weaponType.equalsIgnoreCase("Dagger")) {
			player1.setAttack(player1.getAttack() + dagger);
			System.out.println("You chose the " + weaponType + ". Your attack power is now " + player1.getAttack());
		} else if (weaponType.equalsIgnoreCase("")) {
			System.out.println("You didn't choose anything, your attack power is still " + player1.getAttack());
		}
		
		System.out.println("\nYou can test it out on that enemy over there.");
		System.out.println("\nWhat will you do?: ");
		
		String userAction = input.nextLine();
		if (userAction.equalsIgnoreCase("Attack")) {
			//player1 attacks the enemy
		} else if (userAction.equalsIgnoreCase("Run")) {
			System.out.print("You ran away... Guess that's the end!");
		}
		
		

	}

}
