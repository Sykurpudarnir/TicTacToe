import java.util.Scanner;

public class Human extends Player{
	
	public Human(int player){
		super(player)
		this.player = player;
	}
	char getGuess()
	{
		StdOut.print("Enter X or O");
		Scanner user_input = new Scanner( System.in );
		char inputFromUser = user_input.next().charAt(0);
		return inputFromUser;
	}
}
