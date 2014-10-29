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
                        assertEquals("x", TicTacToe.add("x"));
                }
}
