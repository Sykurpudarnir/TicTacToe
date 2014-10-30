<<<<<<< HEAD
package is.ru.tictactoe;
=======
>>>>>>> 809e96fc4c380998728f0aba55720207db1b4abd

public class TicTacToe{
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
	public static String Players(int a)
	{
		if(a == 1) {
			return "You chose 2 player";
		}
		else if(a == 2){
			return "You chose 1 player";
		}
		else
		{
			return "Please choose 1 for 2 player and 2 for 1 player";
		}
	}

	static int col = 3;
	static int rows = 3;


        static char[][] board = new char[rows][col];


        public static void newBoard(){
                for(int i = 0; i < rows; i++)
                {
                        for(int j = 0; j < col; j++)
                        {
                                board[i][j] = 0;
                        }
                }
        }

        public static void printBoard(){
                for(int i = 0; i < rows; i++)
                {
                        for(int j = 0; j < col; j++)
                        {
                                if(j < col - 1)
                                {
                                        if(board[i][j] == 0)
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
                                        if(board[i][j] == 0)
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

	public static boolean checkIfWon(){
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2])
		{
			return true;
		}
		if(board[0][2] == board[1][1] && board[1][1] == board[2][0])
		{
			return true;
		}
		for(int i = 0; i < rows; i++)
		{
			if(board[0][i] == board[1][i] && board[1][i] == board[2][i])
			{
				return true;
			}
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2])
			{
				return true;
			}
		}
		
		return false;	
	}

        public static void main(String[] args) {
                newBoard();
                printBoard();
        }
}
