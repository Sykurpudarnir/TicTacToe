package is.ru.tictactoe;
import java.util.Scanner;
public class TicTacToe{

	static int player1 = 0;
	static int player2 = 0;
	public static int count = 1;

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

	public static String checkIfWon(char[][] board){
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != ' ')
        {
                if(board[0][0] == 'X'){
                        System.out.println("Congratulation player1, you won!!!!");
                        return "Congratulation player1, you won!!!!";
                }

                else{
                        System.out.println("YOU LOST!! The computer won!!");
                        return "YOU LOST!! The computer won!!";
                }
        }
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != ' ')
        {
                if(board[0][2] == 'X'){
                        System.out.println("Congratulation player1, you won!!!!");
                        return "Congratulation player1, you won!!!!";
                }

                else{
                        System.out.println("YOU LOST!! The computer won!!");
                        return "YOU LOST!! The computer won!!";
                }
        }
        for(int i = 0; i < 3; i++)
        {
                if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[1][i] != ' ')
                {
                        if(board[0][i] == 'X'){
                                System.out.println("Congratulation player1, you won!!!!");
                                return "Congratulation player1, you won!!!!";
                        }

                        else{
                                System.out.println("YOU LOST!! The computer won!!");
                                return "YOU LOST!! The computer won!!";
                        }
                }
                if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][2] != ' ')
                {
                        if(board[i][0] == 'X'){
                                System.out.println("Congratulation player1, you won!!!!");
                                return "Congratulation player1, you won!!!!";
                        }
                        else{
                                System.out.println("YOU LOST!! The computer won!!");
                                return "YOU LOST!! The computer won!!";
                        }
                }
        }

        return "continue";
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
		} while(!(row >= 0) || !(row< 3));

		do{
			System.out.println("Select which column from 0-2 you wish to place your symbol.");
			while(!user_input.hasNextInt()){
				System.out.println("That's not a number! Input the NUMBER of the column you wish to place your symbol! :)");
				user_input.next();
			}
			column = user_input.nextInt();
		}while(!(column >= 0) || !(column < 3));

		if(row < 3 && row >= 0 && column < 3 && column >= 0 && Board.board[row][column] == ' '){
			Board.board[row][column]  = 'X';
			count++;
			result = true;
		}
		else{
			System.out.println("Oh no!! that place is already occupied, choose another place for your symbol :)");
			result = false;
		}
		return result;
	}


	public static void computersTurn(char[][] board){
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
			if(count % 2 != 0){
				break;
			}
		}
	}


	public static String playGame(char[][] board, int row, int column){

		while(checkIfWon(Board.board) == "continue"){

			if(count%2 != 0){
				TicTacToe.playersTurn(Board.board, row, column);
			}

			else if(count % 2 == 0){
				TicTacToe.computersTurn(Board.board);
			}
			if(count == 10){
				System.out.println("Game has finished. It was a draw!");
				break;
			}
		}
		return "Lets play again!";
	}



	public static void main(String[] args) {
		int row = 1;
		int column = 2;
		Board.newBoard();
		TicTacToe.playGame(Board.board, row, column);
		Board.printBoard(Board.board);

	}
}
