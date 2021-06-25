package com.bridgelab.tictactoe;

import java.util.Scanner;

/**********************************************
 * @author mihir
 * 
 * @since 25-June-2021
 * 
 * In this class we are creating TicTacToe game.
 **********************************************/
public class TicTacToe
{
	public static char[] tictactoeArray = new char[10];
	
	/**
	 * Name : createTicTacToeBoard.
	 * 
	 * Description : Creating Tic-Tac-Toe Board.
	 * 
	 * Algorithm : In this function we are taking an char[] tictactoeArray array and starting from the 1st index 
	 * Assigning '-' till the last index number.
	 * 
	 * Modified : First commit 25-June-2021
	 */
	public static void createTicTacToeBoard()
	{
		for(int i = 1; i < tictactoeArray.length; i++)
		{
			tictactoeArray[i] = '-';
		}
	}
	
	/**
	 * Name : playerChoiceOfLetter.
	 * 
	 * Description : player can choose which letter he/she want.
	 * 
	 * Algorithm : In this function player has a given preference to choose the letter first. he can either choose x or o letter. 
	 * if player chooses x then o letter will be assign to computer or vice versa.
	 * 
	 * Modified : First commit 25-June-2021
	 */
	public static void playerChoiceOfLetter()
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter your choice to select the character x or o : ");
		char userInput = scannerObject.next().charAt(0);
		scannerObject.close();
		
		if( userInput == 'x' || userInput == 'o' )
		{
			if(userInput == 'x')
			{
				System.out.println("Player chooses x & o is for computer.");
			}
			else
			{
				System.out.println("Player chooses o & x is for computer.");
			}
		}
		else
		{
			System.out.println("Invalid Input ! Try again.");
			playerChoiceOfLetter();
		}
	}
	
	public static void main(String[] args)
	{
		createTicTacToeBoard();
		playerChoiceOfLetter();
	}
}
