package is.ru.tictactoe;
import java.util.Scanner;
public class TicTacToe{

	static int player1 = 0;
	static int player2 = 0;

       public static String inputFromUser(String text)
        {	
                if(text.equals("X"))
                {
                        return "X";
                }
		else if(text.equals("O"))
		{
			return "O";
		}
                else
		{
			return "Please choose either X or O";
		}
        }

	public static String Players(int player)
	{
		
		if(player == 1) {
			player1 = player;
			player2 = 2;
			System.out.println("You chose to be player1");
			return "You chose to be player1";
		}
		else if(player == 2){
			player2 = player;
			player1 = 1;
			System.out.println("You chose to be player2");
			return "You chose to be player2";
		}
		else
		{
			return "Please choose 1 for player1 and 2 for player2";
		}
	}


	public static int checkIfWon(char[][] board){
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != ' ')
		{
			if(board[0][0] == 'X')
			return 1; // if 1, player 1 wins
			else
			return 2;
		}
		if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != ' ')
		{
			if(board[0][2] == 'X')
                        return 1; // if 1, player 1 wins

                        else
                        return 2;
		}
		for(int i = 0; i < 3; i++)
		{
			if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[1][i] != ' ')
			{
				if(board[0][i] == 'X')
                        	return 1; // if 1, player 1 wins

                        	else
                        	return 2;
			}
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][2] != ' ')
			{
				if(board[i][0] == 'X')
                        	return 1; // if 1, player 1 wins

                        	else
                        	return 2;
			}
		}
		
		return 3;	
	}


	public static void playGame(){
		Scanner user_input = new Scanner(System.in);

		int count = 1; 
		while(checkIfWon(Board.board) == 3){
			if(count%2 != 0){
				System.out.println("player 1's turn");

				System.out.println("Input x coordinate of the location where you would like to place your symbol");
				int xcoordinate = Integer.parseInt(user_input.next());

				System.out.println("Input y coordinate of the location where you would like to place your symbol");
				int ycoordinate = Integer.parseInt(user_input.next());

				if((Board.board[xcoordinate][ycoordinate] == ' ' ) && (xcoordinate * ycoordinate <= 4) && (xcoordinate >= 0) &&(ycoordinate >= 0)){
					Board.board[xcoordinate][ycoordinate]  = 'X';
					count++;
				}
				else{
					System.out.println("Your coordinates are either out of bounds or already occupied");
					break;
				}
			}
			else{
				System.out.println("computers turn");
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 3; j++){
						if(Board.board[i][j] == ' '){
							Board.board[i][j] = 'O';
							count++;
							Board.printBoard(Board.board);
							break;
						}
					}
					break;
				}
			}
		}
	}


	public static void main(String[] args) {
		Board.newBoard();
		TicTacToe.playGame();
		Board.printBoard(Board.board);

	}
}
