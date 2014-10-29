package is.ru.tictactoe;

public class TicTacToe{
        public static String add(String text)
        {
                if(text.equals("X"))
                {
                        return "X";
                }
		else if(text.equals("O"))
		{
			return "O";
		}
                else
		{
			return "Please choose either X or O";
		}
        }
	public static String Players(int a)
	{
		if(a == 1) {
			return "You chose 2 player";
		}
		else if(a == 2){
			return "You chose 1 player";
		}
		else
		{
			return "Please choose 1 for 2 player and 2 for 1 player";
		}
	}
}

