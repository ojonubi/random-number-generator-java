import java.util.Scanner;
import java.util.Random;
public class GuessingGameRunner {
	
	/**
	 * ask the user to provide a number range to guess from
	 * using the value the user provides, create a guess game app with values between 0 and users value
	 * the user will begin the guess game 
	 * if the user guess the value, a sweet message will pop on the screen
	 * generate a fail safe value to get the user out of the program.
	 **/
	public static void main(String[] args) {
		int numberRange;
		int guessValue;
		int usersGuess;
		Scanner scan = new Scanner(System.in);
		
		//user provide guess range
		System.out.println("Provide a guess range value");
		numberRange = scan.nextInt();
		
		//generate random
		Random rand = new Random();
		guessValue=rand.nextInt(numberRange) + 1;
		
		//compare values
		do {
			System.out.println("Try to guess the number generated: ");
			usersGuess = scan.nextInt();
			if(usersGuess == guessValue) {
				System.out.println("You guessed the right value");
			}
			else {
				System.out.println("Incorrect Guess, try again");
			}
			
			
	}while(usersGuess != guessValue);
	}

}
