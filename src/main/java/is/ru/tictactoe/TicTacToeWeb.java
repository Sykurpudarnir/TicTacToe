/*package is.ru.tictactoe;
import java.util.Scanner;

import static spark.Spark.*;
import spark.*;


public class TicTacToeWeb{

	public static void main(String[] args) {


	staticFileLocation("/public");
        setPort(Integer.valueOf(System.getenv("PORT")));
        final TicTacToe tictactoe = new TicTacToe();
	final Board board = new Board();	
	

        post(new Route("/add") 
        {
            @Override
       		public Object handle(Request request, Response response)
            {

            	Integer pos = Integer.valueOf(request.queryParams("pos"));
            	
            	int row = 0;
            	int col = 0;
            	if(pos < 3){
            		row = 0;
            		col = pos;
            	}
            	else if(pos < 6){
            		row = 1;
            		col = pos - 3;
            	}
            	else {
            		row = 2;
            		col = pos - 6;
            	}

		board = new char[row][col];


            	//String sym = Character.toString(tictactoe.current.getSymbol());

				if(tictactoe.checkIfWon()){
					return;
				}
				else{
					tictactoe.playGame(board, row, col);
					if(tictactoe.checkIfWon()){
						return;
					}
					return sym;
					
				}

			}


		});

	}
}*/
