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
		public void testPlayers()
		{
			assertEquals("You chose 1 player", TicTacToe.Players(2));
		}

		@Test
		public void testWinner()
		{
			char[][] board1 = new char[][]{{'X', 'O', 'O'},{'X','X','O'},{'O','X','X'}};
			char[][] board2 = new char[][]{{'X', 'O', 'X'},{'X','O','O'},{'O','X','X'}};
			char[][] board3 = new char[][]{{'O', 'O', 'X'},{' ','X',' '},{'X',' ',' '}};
			assertEquals(true, TicTacToe.checkIfWon(board1));
			assertEquals(false, TicTacToe.checkIfWon(board2));
			assertEquals(true, TicTacToe.checkIfWon(board3));
		}
}
