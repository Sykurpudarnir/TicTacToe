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
                        assertEquals("O", TicTacToe.add("O"));
                }
		
		@Test
		public void testPlayers()
		{
			assertEquals("You chose 1 player", TicTacToe.Players(2));
		}
}
