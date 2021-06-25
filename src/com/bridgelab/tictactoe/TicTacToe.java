package com.bridgelab.tictactoe;

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
	
	public static void main(String[] args)
	{
		createTicTacToeBoard();
	}
}
