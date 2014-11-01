package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest{
        public static void main(String arg[]){
        org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
        }
		@Test
		public void testWinnerLost()
		{
			char[][] board2 = new char[][]{{'X', 'O', 'X'},{'X','O','O'},{'O','X','X'}};
			char[][] board4 = new char[][]{{'O', 'O', 'X'},{' ','X',' '},{' ',' ',' '}};
			assertEquals("continue", TicTacToe.checkIfWon(board2));
			assertEquals("continue", TicTacToe.checkIfWon(board4));
		}

		@Test
		public void testWinnerDiag()
		{
			char[][] board1 = new char[][]{{'X', 'O', 'O'},{'X','X','O'},{'O','X','X'}};
			char[][] board3 = new char[][]{{'O', 'O', 'X'},{' ','X',' '},{'X',' ',' '}};
			assertEquals("Congratulation player1, you won!!!!", TicTacToe.checkIfWon(board1));
			assertEquals("Congratulation player1, you won!!!!", TicTacToe.checkIfWon(board3));
		}

		@Test
		public void testWinnerCol()
		{
			char[][] board5 = new char[][]{{'O', 'O', 'X'},{'O','X','X'},{'O','X',' '}};
			assertEquals("YOU LOST!! The computer won!!", TicTacToe.checkIfWon(board5));
		}
		
		@Test
		public void testWinnerRow()
		{
			char[][] board6 = new char[][]{{'O', 'O', 'X'},{'X','X','X'},{'O','X','O'}};
                        assertEquals("Congratulation player1, you won!!!!", TicTacToe.checkIfWon(board6));
		}
		
		@Test
		public void testNewBoard()
		{
			char[][] board7 = new char[][]{{' ', ' ', ' '},{' ',' ',' '},{' ',' ',' '}};
			assertEquals(board7, Board.newBoard());
		}
}
