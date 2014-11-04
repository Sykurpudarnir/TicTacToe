package is.ru.tictactoe;
import java.util.Scanner;

public class TicTacToe{

	public static int count = 1;

	//checks if someone has won the game
	public static boolean checkIfWon(char[][] board){
	//checks the diagonal line for wins
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != ' ')
        {
               //if the winning symbol is X then player1 won!
		 if(board[0][0] == 'X'){
                        System.out.println("Congratulation player1, you won!!!!");
                }
		//else the computer won!
                else{
                        System.out.println("YOU LOST!! The computer won!!");
                }
		return true;
        }
	//checks the opposite diagonal line for wins
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != ' ')
        {
                if(board[0][2] == 'X'){
                        System.out.println("Congratulation player1, you won!!!!");
                }

                else{
                        System.out.println("YOU LOST!! The computer won!!");
                }
		return true;
        }
        for(int i = 0; i < 3; i++)
        {	//checks every column for win
                if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[1][i] != ' ')
                {
                        if(board[0][i] == 'X'){
                                System.out.println("Congratulation player1, you won!!!!");
                        }

                        else{
                                System.out.println("YOU LOST!! The computer won!!");
                        }
			return true;
                }
		//checks all rows for win
                if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][2] != ' ')
                {
                        if(board[i][0] == 'X'){
                                System.out.println("Congratulation player1, you won!!!!");
                        }
                        else{
                                System.out.println("YOU LOST!! The computer won!!");
                        }
			return true;
                }
        }

        return false;
}

	
	//handles the move from the human player
	public static void  playersTurn(char[][] board){
 	//	Board board = Board.newBoard;
		int row = 1;
		int column = 1;
		Scanner user_input = new Scanner(System.in);
 		boolean result = false;
        	System.out.println("player 1's turn");
		//a do while loop that first checks if the user input is a number, and asks user to enter a number
        	do{
          		System.out.println("Select which row from 0-2 you wish to place your symbol");
                	while(!user_input.hasNextInt()){
                		System.out.println("That's not a number! Input the NUMBER of the row you wish to place your symbol! :)");
                        	user_input.next();
                	}
                	row = user_input.nextInt();
        	} while(!(row >= 0) || !(row < 3)); 
		//we repeat this while the user input doesn't meet our conditions
		//this do while loop does the same as the previous one except for the columns	
        	do{
          		System.out.println("Select which column from 0-2 you wish to place your symbol.");
                	while(!user_input.hasNextInt()){
                		System.out.println("That's not a number! Input the NUMBER of the column you wish to place your symbol! :)");
                        	user_input.next();
                	}
                	column = user_input.nextInt();
        	}while(!(column >= 0) || !(column < 3));
		//checks if the selected row and column are available
        	if(board[row][column] == ' ')
		{
        		board[row][column]  = 'X';
                	Board.printBoard(board);
        	}
		//if row and column are not available we give this error message and ask user to try another place for their symbol
        	else
		{
        		System.out.println("Oh no!! that place is already occupied, choose another place for your symbol :)");
        	}
	}
	//this function executes the computers automatic move
	public static boolean computersTurn(char[][] board){
		System.out.println("computers turn");
		outerloop:
		//finds the next available space and places the computers symbol there
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(board[i][j] == ' '){
					board[i][j] = 'O';
					Board.printBoard(board);
					break outerloop;
				}
			}
		}
		//when the computer has made its move we break out of our for loops
		if(count % 2 != 0){
			return true;
		}
		
		return false;
	}

	//calls the functions needed to play the game
	public static String playGame(char[][] board, int count){
		//while no one has won the game, the players are asked to keep making their moves.
		System.out.println("Hallo Hallo");
		while(!checkIfWon(board)){
			if(count%2 != 0){

				TicTacToe.playersTurn(board);
				
			}
			else if(count % 2 == 0){

				TicTacToe.computersTurn(board);
				

			}
			//if we have placed symbols in 9 places, there are no more left, we check if someone has won the game, if not we know it is a draw.
			if(count == 10){
				if(!checkIfWon(board))
				{
					System.out.println("Game has finished. It was a draw!");
					return "Game has finished. It was a draw!";
				}
			
			}
			count++;
		}
		return "Lets play again!";
	}

	public static void main(String[] args) {
		Board.newBoard();
		TicTacToe.playGame(Board.board,count);
	}
}
