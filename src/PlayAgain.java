/*
 * ---------------------------------------------------------------------------
 * File name: PlayAgain.java
 * Project name: RockPaperScissors
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 3/28/2019
 * ---------------------------------------------------------------------------
 */

import java.util.Scanner;

public class PlayAgain
{
	// TODO: implement the PlayAgain class

	public static void WantToPlayAgain()
	{


		Scanner keyboard = new Scanner(System.in);
		String response;

		System.out.println("Would you like to play again? (Y/N)");
		response = keyboard.nextLine();

		if (response.toUpperCase().charAt(0) == 'Y')
		{
			System.out.println("Sweet, lets play again\n");
			You.YourTurn();
		}
		else if(response.toUpperCase().charAt(0) == 'N')
		{
			System.out.println("OK, have a good day");
		}
		else
		{
			System.out.println("invalid entry, Please try again!!!");
			WantToPlayAgain();
		}
	}


}
