
public abstract class Player()
{
	protected int player;
	public Player(int wins)
	{
		this.wins = 0; 
	}

	char getGuess()
	{
		return 0;
	}
	
	char setWins(int newWins)
	{
		wins = newWins
	}
	
	int getWins()
	{
		return wins;
	}
	
}
