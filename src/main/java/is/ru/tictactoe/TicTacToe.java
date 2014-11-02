package is.ru.tictactoe;
import java.util.Scanner;

public class TicTacToe{

	public static int count = 1;


	public static boolean checkIfWon(char[][] board){
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != ' ')
        {
                if(board[0][0] == 'X'){
                        System.out.println("Congratulation player1, you won!!!!");
                }

                else{
                        System.out.println("YOU LOST!! The computer won!!");
                }
		return true;
        }
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
        {
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

public static boolean playersTurn(char[][] board, int row, int column){
		Scanner user_input = new Scanner(System.in);
		boolean result = false;
		System.out.println("player 1's turn");
		do{
			System.out.println("Select which row from 0-2 you wish to place your symbol");
			while(!user_input.hasNextInt()){
				System.out.println("That's not a number! Input the NUMBER of the row you wish to place your symbol! :)");
				user_input.next();
			}
			row = user_input.nextInt();
		} while(!(row >= 0) || !(row < 3));

		do{
			System.out.println("Select which column from 0-2 you wish to place your symbol.");
			while(!user_input.hasNextInt()){
				System.out.println("That's not a number! Input the NUMBER of the column you wish to place your symbol! :)");
				user_input.next();
			}
			column = user_input.nextInt();
		}while(!(column >= 0) || !(column < 3));

		if(board[row][column] == ' '){
			board[row][column]  = 'X';
			//count++;
			Board.printBoard(board);
			return true;
		}
		else{
			System.out.println("Oh no!! that place is already occupied, choose another place for your symbol :)");
		}
		return result;
	}

	public static boolean computersTurn(char[][] board){
		System.out.println("computers turn");
		outerloop:
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(board[i][j] == ' '){
					board[i][j] = 'O';
			//		count++;
					Board.printBoard(board);
					break outerloop;
				}
			}
		}
		if(count % 2 != 0){
			return true;
		}
		
		return false;
	}

	public static String playGame(char[][] board, int count){
		System.out.println(count);
		while(!checkIfWon(board)){
			if(count%2 != 0){
				int row = 1;
				int column = 1;
				
				TicTacToe.playersTurn(board, row, column);
				
			}
			else if(count % 2 == 0){
				TicTacToe.computersTurn(board);
				

			}
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
		int row = 1;
		int column = 2;
		Board.newBoard();
		TicTacToe.playGame(Board.board,count);
		//Board.printBoard(Board.board); //This will not be used in the Web version.
	}
}
