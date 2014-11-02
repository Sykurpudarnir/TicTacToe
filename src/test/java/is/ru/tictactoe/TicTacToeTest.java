package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest{

        public static void main(String arg[]){
		org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
        }
	
	//Checks if the boolean function checkIfWon returns false when neither player has won the game.
	@Test
	public void testWinnerLost(){
		char[][] board2 = new char[][]{{'X','O','X'},{'X','O','O'},{'O','X','X'}};
		char[][] board4 = new char[][]{{'O','O','X'},{' ','X',' '},{' ',' ',' '}};
		assertEquals(false, TicTacToe.checkIfWon(board2));
		assertEquals(false, TicTacToe.checkIfWon(board4));
	}
	
	//Checks if the boolean function checkIfWon returns true when a player has won the game by getting three symbols in a row diagonal.
	@Test
	public void testWinnerDiag(){
		char[][] board1 = new char[][]{{'X','O','O'},{'X','X','O'},{'O','X','X'}};
		char[][] board3 = new char[][]{{'O','O','X'},{' ','X',' '},{'X',' ',' '}};
		assertEquals(true, TicTacToe.checkIfWon(board1));
		assertEquals(true, TicTacToe.checkIfWon(board3));
	}

	//Checks if the boolean function checkIfWon returns true when a player has won the game by getting three symbols in columns row.
	@Test
	public void testWinnerCol()
	{
		char[][] board5 = new char[][]{{'O', 'O', 'X'},{'O','X','X'},{'O','X',' '}};
		assertEquals(true, TicTacToe.checkIfWon(board5));
	}
		
	//Checks if the boolean functon checkIfWon returns true when a player has won the game by getting three symbols in rows in a row
	@Test
	public void testWinnerRow()
	{
		char[][] board6 = new char[][]{{'O', 'O', 'X'},{'X','X','X'},{'O','X','O'}};
                assertEquals(true, TicTacToe.checkIfWon(board6));
	}
		
	//Checks if the function newBoard from the Board class does print out a game board with no symbols.
	@Test
	public void testNewBoard()
	{
		char[][] board7 = new char[][]{{' ', ' ', ' '},{' ',' ',' '},{' ',' ',' '}};
		assertEquals(board7, Board.newBoard());
	}

	//Checks to see if the computer makes its move when it should.
	@Test
        public void testComputersTurn()
        {
		char[][] board8 = new char[][]{{'X', ' ', ' '},{' ',' ',' '},{' ',' ',' '}};
                assertEquals(true, TicTacToe.computersTurn(board8));
        }
	
	//Checks if the function playGame works correctly when there is no winner. It prints out that it was a draw.
	@Test
        public void testItsADraw()
        {
                char[][] board10 = new char[][]{{'O', 'X', 'O'},{'O','X','X'},{'X','O','X'}};
                assertEquals("Game has finished. It was a draw!", TicTacToe.playGame(board10,10));
        }

}
