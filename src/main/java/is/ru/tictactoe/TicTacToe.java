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


	 public static String playGame(){
         Scanner user_input = new Scanner(System.in);

         int count = 1;
         while(checkIfWon(Board.board) == "continue"){

                 if(count%2 != 0){
                         System.out.println("player 1's turn");
                         int xcoordinate;
                         do{
                                 System.out.println("Select which row from 0-2 you wish to place your symbol");
                                 while(!user_input.hasNextInt()){
                                         System.out.println("That's not a number! Input the NUMBER of the row you wish to place your symbol! :)");
                                         user_input.next();
                                 }
                                 xcoordinate = user_input.nextInt();
                         } while(!(xcoordinate >= 0) || !(xcoordinate < 3));

                         int ycoordinate;
                         do{
                                 System.out.println("Select which column from 0-2 you wish to place your symbol.");
                                 while(!user_input.hasNextInt()){
                                         System.out.println("That's not a number! Input the NUMBER of the column you wish to place your symbol! :)");
                                         user_input.next();
                                 }
                                 ycoordinate = user_input.nextInt();
                         }while(!(ycoordinate >= 0) || !(ycoordinate < 3));

                         if(Board.board[xcoordinate][ycoordinate] == ' '){
                                 Board.board[xcoordinate][ycoordinate]  = 'X';
                                 count++;
                         }
                         else{
                                 System.out.println("Oh no!! that place is already occupied, choose another place for your symbol :)");
                         }
                 }
                 else if(count % 2 == 0){
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
                 if(count == 11){
                        System.out.println("Game has finished. It was a draw!");
                        break;
                 }
        }
         return "Let's play again!";
 }


	public static void main(String[] args) {
		Board.newBoard();
		TicTacToe.playGame();
		Board.printBoard(Board.board);

	}
}
