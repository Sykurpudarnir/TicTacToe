package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest{
        public static void main(String arg[]){
        org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
        }
                @Test
                public void testXoreO()
                {
                        assertEquals("O", TicTacToe.inputFromUser("O"));
                }
		
		@Test
		public void testX()
		{
			assertEquals("X", TicTacToe.inputFromUser("X"));
		}
		
		@Test
		public void testNotXO()
		{
			assertEquals("Please choose either X or O", TicTacToe.inputFromUser("U"));
		}
		
		@Test
		public void testWinner()
		{
			char[][] board1 = new char[][]{{'X', 'O', 'O'},{'X','X','O'},{'O','X','X'}};
			char[][] board2 = new char[][]{{'X', 'O', 'X'},{'X','O','O'},{'O','X','X'}};
			char[][] board3 = new char[][]{{'O', 'O', 'X'},{' ','X',' '},{'X',' ',' '}};
			char[][] board4 = new char[][]{{'O', 'O', 'X'},{' ','X',' '},{' ',' ',' '}};
			char[][] board5 = new char[][]{{'O', 'O', 'X'},{'O','X','X'},{'O','X',' '}};
			assertEquals(1, TicTacToe.checkIfWon(board1));
			assertEquals(3, TicTacToe.checkIfWon(board2));
			assertEquals(1, TicTacToe.checkIfWon(board3));
			assertEquals(3, TicTacToe.checkIfWon(board4));
			assertEquals(2, TicTacToe.checkIfWon(board5));
		}
		
		@Test
                public void testPlayer1()
                {
                        assertEquals("You chose to be player1", TicTacToe.Players(1));
                }
		@Test
		public void testPlayer2()
		{
			assertEquals("You chose to be player2", TicTacToe.Players(2));
		}
}
