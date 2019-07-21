import java.util.Random;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String y = "y";

		while (y.equalsIgnoreCase("y")) {
			int diceNum;
			int diceNum1;

			System.out.println("Welcome to the Grand Circus Casino!");
			System.out.println();
			System.out.println("Enter the number of sides your die has: ");
			diceNum = scan.nextInt();
			System.out.println("Enter the number of sides your second die has: ");
			diceNum1 = scan.nextInt();
			System.out.println();
			System.out.println("Your Roll: ");
			System.out.println(generateRandomDieRoll(diceNum));
			System.out.println(generateRandomDieRoll(diceNum1));
			System.out.println("Roll Again? y/n");
			scan.nextLine();
			y = scan.nextLine();


		}

		System.out.println("Come back soon! Goodybye");
		scan.close();
	}

	public static int generateRandomDieRoll(int x) {
		Random ranGen = new Random();
		return ranGen.nextInt(x - 1 + 1) + 1;

	}

}
