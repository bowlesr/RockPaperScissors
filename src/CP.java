/*
 * ---------------------------------------------------------------------------
 * File name: CP.java
 * Project name: RockPaperScissors
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 3/28/2019
 * ---------------------------------------------------------------------------
 */

import java.util.Random;

public class CP
{

	private static int number;

	public static int getNumber ( )
	{
		return number;
	}

	// TODO: implement the CP class

	public static void Computer()
	{


		int number = CPPick();

		System.out.println(number);

		switch (number)
		{
			case 1:
				System.out.println("\n The Computer picked Rock \n");
				break;
			case 2:
				System.out.println("\n The Computer picked Paper \n");
				break;
			case 3:
				System.out.println("\n The Computer picked Scissors \n");
				break;
		}

	}

	public static int CPPick()
	{
		Random randomNum = new Random();
		number = randomNum.nextInt(3)+1;
		return number;
	}


}
