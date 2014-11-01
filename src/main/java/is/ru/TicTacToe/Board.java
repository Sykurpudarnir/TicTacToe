package is.ru.TicTacToe;

public class Board{

   	static int col = 3;
        static int rows = 3;


        static char[][] board;


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
}
