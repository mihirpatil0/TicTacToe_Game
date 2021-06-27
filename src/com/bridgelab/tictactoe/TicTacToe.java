package com.bridgelab.tictactoe;

import java.util.Random;
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
	public static char computerChosenLetter, userChosenLetter;
	
	public static Scanner scannerObject = new Scanner(System.in);
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
		
		System.out.print("Enter your choice to select the character x or o : ");
		userChosenLetter = scannerObject.next().charAt(0);
		
		if( userChosenLetter == 'x' || userChosenLetter == 'o' )
		{
			if(userChosenLetter == 'x')
			{
				computerChosenLetter = 'o';
				System.out.println("Player chooses x & o is for computer.\n");
				showTicTacToeBoard();
			}
			else
			{
				computerChosenLetter = 'x';
				System.out.println("Player chooses o & x is for computer.\n");
				showTicTacToeBoard();
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
		System.out.println("");
		System.out.println("|---|---|---|");
		System.out.println("| " + tictactoeBoard[1] + " | " + tictactoeBoard[2] + " | " + tictactoeBoard[3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + tictactoeBoard[4] + " | " + tictactoeBoard[5] + " | " + tictactoeBoard[6] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + tictactoeBoard[7] + " | " + tictactoeBoard[8] + " | " + tictactoeBoard[9] + " |");
		System.out.println("|---|---|---|");
		System.out.println("");
	}
	
	/**
	 * UC-4
	 * Name : playerMove
	 * 
	 * Description : Setting user chosen letter to selected index number.
	 * 
	 * Algorithm : player enters index number to put chosen letter ,if that index is not empty then asking player,
	 * to enter index number again. method checks if selected index is between number 1 to 9 or not if not asking,
	 * player to choose index number again.
	 * 
	 * @param userLetter // user chosen index number.
	 * 
	 * Modified : First commit 25-June-2021
	 */
	public static void playerMove()
	{
		System.out.print("\n" + "Choose block number from 1 to 9 to to set chosen symbol : ");
		int userSelectedIndex = scannerObject.nextInt();
	
		if(userSelectedIndex >=1 && userSelectedIndex <= 9)
		{
			if(tictactoeBoard[userSelectedIndex] == '-')
			{
				tictactoeBoard[userSelectedIndex] = userChosenLetter;
				showTicTacToeBoard();
			}
			else
			{
				System.out.println("Block already occupied, Enter another index number.");
				playerMove();
			}
		}
		else
		{
			System.out.println("Incorrect block number, Enter again.");
			playerMove();
		}
	}
	
	/**
	 * UC-5
	 * 
	 * Name - Todo toss to decide who goes first.
	 * 
	 * Description : with the help of toss will decide who will go first.
	 * 
	 * Algorithm : player have to chose either head or tail as his/her call.
	 * making use of random.nextInt() function to draw toss.
	 * checking if what player has chosen and what is drawn from random.nextInt() is same.
	 * then player wins, player makes first move or computer will first move.
	 * 
	 * Modification : First commit 26-June-2021
	 */
	public static void tossWhoPlayFirst()
	{  
		Random randomToss = new Random();
		int whoGoFirst = randomToss.nextInt(2);
		System.out.println("\n"+whoGoFirst+"\n");
		
		System.out.print("Toss is to decide who makes first move : Enter number 1 for head or 0 for tail as a choice : ");
		int tossChoice = scannerObject.nextInt();
		
		if(tossChoice == whoGoFirst && tossChoice == whoGoFirst)
		{
			System.out.println("Player wins the toss. Make first move.");
			playerMove();
		}
		else
		{
			System.out.println("Computer wins the toss.  Making first move.");
		}
	}
	
	public static void main(String[] args)
	{
		createTicTacToeBoard();
		playerChoiceOfLetter();
		tossWhoPlayFirst();
	}
}
