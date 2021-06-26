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
	public static char[] tictactoeBoard = new char[10];
	
	/**
	 * UC-1
	 * Name : createTicTacToeBoard.
	 * 
	 * Description : Creating Tic-Tac-Toe Board.
	 * 
	 * Algorithm : In this function we are taking an char[] tictactoeBoard array and starting from the 1st index 
	 * Assigning '-' till the last index number.
	 * 
	 * Modified : First commit 25-June-2021
	 */
	public static void createTicTacToeBoard()
	{
		for(int i = 1; i < tictactoeBoard.length; i++)
		{
			tictactoeBoard[i] = '-';
		}
	}
	
	/**
	 * UC-2
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
		char computerInput;
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter your choice to select the character x or o : ");
		char userInput = scannerObject.next().charAt(0);
		scannerObject.close();
		
		if( userInput == 'x' || userInput == 'o' )
		{
			if(userInput == 'x')
			{
				computerInput = 'o';
				System.out.println("Player chooses x & o is for computer.\n");
			}
			else
			{
				computerInput = 'x';
				System.out.println("Player chooses o & x is for computer.\n");
			}
		}
		else
		{
			System.out.println("Invalid Input ! Try again.");
			playerChoiceOfLetter();
		}
	}
	
	/**
	 * UC-3
	 * Name: showTicTacToeBoard
	 * 
	 * Description : Display current board.
	 * 
	 * Algorithm : With print statement displaying current state of board.
	 * 
	 * Modification : First commit 25-June-2021
	 */
	public static void showTicTacToeBoard()
	{
		System.out.println("|---|---|---|");
		System.out.println("| " + tictactoeBoard[1] + " | " + tictactoeBoard[2] + " | " + tictactoeBoard[3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + tictactoeBoard[4] + " | " + tictactoeBoard[5] + " | " + tictactoeBoard[6] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + tictactoeBoard[7] + " | " + tictactoeBoard[8] + " | " + tictactoeBoard[9] + " |");
		System.out.println("|---|---|---|");
	}
	
	public static void main(String[] args)
	{
		createTicTacToeBoard();
		playerChoiceOfLetter();
		showTicTacToeBoard();
	}
}
