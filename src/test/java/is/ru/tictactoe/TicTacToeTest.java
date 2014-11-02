package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest{

        public static void main(String arg[]){
		org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
        }

	@Test
	public void testWinnerLost(){
		char[][] board2 = new char[][]{{'X','O','X'},{'X','O','O'},{'O','X','X'}};
		char[][] board4 = new char[][]{{'O','O','X'},{' ','X',' '},{' ',' ',' '}};
		assertEquals(false, TicTacToe.checkIfWon(board2));
		assertEquals(false, TicTacToe.checkIfWon(board4));
	}

	@Test
	public void testWinnerDiag(){
		char[][] board1 = new char[][]{{'X','O','O'},{'X','X','O'},{'O','X','X'}};
		char[][] board3 = new char[][]{{'O','O','X'},{' ','X',' '},{'X',' ',' '}};
		assertEquals(true, TicTacToe.checkIfWon(board1));
		assertEquals(true, TicTacToe.checkIfWon(board3));
	}

	@Test
	public void testWinnerCol()
	{
		char[][] board5 = new char[][]{{'O', 'O', 'X'},{'O','X','X'},{'O','X',' '}};
		assertEquals(true, TicTacToe.checkIfWon(board5));
	}
		
	@Test
	public void testWinnerRow()
	{
		char[][] board6 = new char[][]{{'O', 'O', 'X'},{'X','X','X'},{'O','X','O'}};
                assertEquals(true, TicTacToe.checkIfWon(board6));
	}
		
	@Test
	public void testNewBoard()
	{
		char[][] board7 = new char[][]{{' ', ' ', ' '},{' ',' ',' '},{' ',' ',' '}};
		assertEquals(board7, Board.newBoard());
	}

	@Test
        public void testComputersTurn()
        {
		char[][] board8 = new char[][]{{'X', ' ', ' '},{' ',' ',' '},{' ',' ',' '}};
                assertEquals(true, TicTacToe.computersTurn(board8));
        }
	
/*	@Test
        public void testHumanPlayersTurn()
        {
                char[][] board9 = new char[][]{{' ', ' ', ' '},{' ',' ',' '},{' ',' ',' '}};
                assertEquals(true, TicTacToe.playersTurn(board9, 1, 1));
        }*/
	@Test
        public void testItsADraw()
        {
                char[][] board10 = new char[][]{{'O', 'X', 'O'},{'O','X','X'},{'X','O','X'}};
                assertEquals("Game has finished. It was a draw!", TicTacToe.playGame(board10,10));
        }

}
