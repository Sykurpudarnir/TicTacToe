
public class Board {
	static int rows = 3;
	static int col = 3;
	
	
	
	static int[][] board = new int[rows][col];
	
	public static void printBoard(){
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < col; j++)
			{
				if(j < col - 1)
				{
					System.out.print(board[i][j] + " | ");
				}
				else
				{
					System.out.print(board[i][j]);
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
	
	public static void main(String[] args) {
		printBoard();
	}
}
