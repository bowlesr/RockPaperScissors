/*
 * ---------------------------------------------------------------------------
 * File name: Winner.java
 * Project name: RockPaperScissors
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 3/28/2019
 * ---------------------------------------------------------------------------
 */

public class Winner
{
	// TODO: implement the Winner class


	public static void Outcome()
	{
		//String num1 = rock
		// 2 = paper
		// 3 = scissors

		int computer = CP.getNumber();
		int person = You.getResponse();

		if(person == 1 && computer == 3)
		{
			System.out.println("You win\n");
		}
		else if(person == 2 && computer == 1)
		{
			System.out.println("You win\n");
		}
		else if(person == 3 && computer == 2)
		{
			System.out.println("You win\n");
		}

		else if(person == 3 && computer == 1)
		{
			System.out.println("Computer win\n");
		}
		else if(person == 1 && computer == 2)
		{
			System.out.println("Computer win\n");
		}
		else if(person == 2 && computer == 3)
		{
			System.out.println("Computer win\n");
		}

		else if(person == 1 && computer == 1)
		{
			System.out.println("Draw\n");
		}
		else if(person == 2 && computer == 2)
		{
			System.out.println("Draw\n");
		}
		else if (person == 3 && computer == 3)
		{
			System.out.println("Draw\n");
		}
	}
}
