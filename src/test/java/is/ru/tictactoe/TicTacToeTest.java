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
			assertEquals("You chose to be player2", TicTacToe.Players(2));
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
                public void testPlayer1()
                {
                        assertEquals("You chose to be player1", TicTacToe.Players(1));
                }
		@Test
		public void testPlayer2()
		{
			assertEquals("You chose to be player2", TicTacToe.Players(2));
		}
		@Test
		public void testWinnerRow()
		{
			char[][] board6 = new char[][]{{'O', 'O', 'X'},{'X','X','X'},{'O','X','O'}};
                        assertEquals("Congratulation player1, you won!!!!", TicTacToe.checkIfWon(board6));
		}
		
/*		@Test
		public void testPlayersTurn()
		{
			char[][] board7 = new char[][]{{'O',' ','X'},{' ','X','O'},{' ',' ','O'}};
			assertEquals(false, TicTacToe.playersTurn(board7, 2, 2));
		}*/
}
