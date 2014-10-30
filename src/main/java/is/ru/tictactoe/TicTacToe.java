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

	static int col = 3;
	static int rows = 3;


        static char[][] board = new char[rows][col];


        public static char[][] newBoard(){
		board = new char[rows][col];
                for(int i = 0; i < rows; i++)
                {
                        for(int j = 0; j < col; j++)
                        {
                                board[i][j] = ' ';
                        }
                }
		return board;
        }

        public static void printBoard(char[][] board){
                for(int i = 0; i < rows; i++)
                {
                        for(int j = 0; j < col; j++)
                        {
                                if(j < col - 1)
                                {
                                        if(board[i][j] == ' ')
                                        {
                                                System.out.print(" " + " | ");
                                        }
                                        else
                                        {
                                                System.out.print(board[i][j] + " | ");
                                        }
                                }
                                else
                                {
                                        if(board[i][j] == ' ')
                                        {
                                                System.out.print("   ");
                                        }
                                        else
                                        {
                                                System.out.print(board[i][j]);
                                        }
                                }
                        }
                        System.out.println();
                        if(i < rows - 1)
                        {
                                System.out.print("----------");
                                System.out.println();
                        }
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
		for(int i = 0; i < rows; i++)
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

        public static void main(String[] args) {
                printBoard(newBoard());
		System.out.println("Do you want to be player1 or player2? chosee 1 for player1 and 2 for player2");
		int player;
		Scanner in = new Scanner(System.in);
		player = in.nextInt();
		Players(player);
	}
}
