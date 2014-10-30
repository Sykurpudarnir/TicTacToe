<<<<<<< HEAD

=======
package is.ru.tictactoe;
>>>>>>> 46f7ec5e03e1b1952ac59107a52a003b855d33c2
public class TicTacToe{
        public static String inputFromUser(String text)
        {	
		int player1 = 0;
		int player2 = 0;
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
	public static void Players(int player)
	{
		if(player == 1) {
			System.out.println("You chose to be player1");
			player1 = player;
			player2 = 2;
		}
		else if(player == 2){
			System.out.println( "You chose to be player2");
			player2 = player;
			player1 = 1;
		}
		else
		{
			System.out.println("Please choose 1 for player1 and 2 for player2");
		}
	}

	static int col = 3;
	static int rows = 3;


        static char[][] board = new char[rows][col];


<<<<<<< HEAD
        public static char[][] newBoard(){
		board = new char[rows][col];
=======
        public static void newBoard(){
>>>>>>> 46f7ec5e03e1b1952ac59107a52a003b855d33c2
                for(int i = 0; i < rows; i++)
                {
                        for(int j = 0; j < col; j++)
                        {
                                board[i][j] = ' ';
                        }
                }
		return board;
        }

        public static void printBoard(){
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

<<<<<<< HEAD
	public static boolean checkIfWon(char[][] board){
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != ' ')
		{
			return true;
=======
	public static int checkIfWon(){
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2])
		{	
			if(board[0][0] == 'X')
			return 1; // if 1, player 1 wins
			
			else
			return 2;
>>>>>>> 46f7ec5e03e1b1952ac59107a52a003b855d33c2
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
<<<<<<< HEAD
                printBoard(newBoard());
	}
=======
                newBoard();
                printBoard();
        }
>>>>>>> 46f7ec5e03e1b1952ac59107a52a003b855d33c2
}
