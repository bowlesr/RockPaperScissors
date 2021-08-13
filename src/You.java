/*
 * ---------------------------------------------------------------------------
 * File name: You.java
 * Project name: RockPaperScissors
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 3/28/2019
 * ---------------------------------------------------------------------------
 */

import java.util.Scanner;

public class You
{


	private static int response;

	public static int getResponse ( )
	{
		return response;
	}

	// TODO: implement the You class
	public static void YourTurn ()
	{


		System.out.println("Please select an option: 1, 2, or 3\n");
		System.out.println("    1) Rock ");
		System.out.println("    2) Paper ");
		System.out.println("    3) Scissors \n");
		//Scanner keyboard = new Scanner(System.in);


		int response = YourPick();

		switch (response)
		{
			case 1:
				System.out.println(" You picked Rock ");
				break;
			case 2:
				System.out.println(" You picked Paper ");
				break;
			case 3:
				System.out.println(" You picked Scissors ");
				break;
			default:
				System.out.println("Invalid entry, please select a number between 1-3!!!!");
				YourTurn();
				break;
		}

		CP.Computer();

		Winner.Outcome();

		PlayAgain.WantToPlayAgain();


	}

	public static int YourPick()
	{
		Scanner keyboard = new Scanner(System.in);
		response = keyboard.nextInt();
		return response;

	}


}
