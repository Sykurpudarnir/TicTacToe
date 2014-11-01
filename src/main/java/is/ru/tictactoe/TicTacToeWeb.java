package is.ru.tictactoe;
import java.util.Scanner;

import static spark.Spark.*;
import spark.*;


public class TicTacToe{

	public static void main(String[] args) {


		staticFileLocation("/public");
        setPort(Integer.valueOf(System.getenv("PORT")));
        final Game tictactoe = new Game();

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

            	String sym = Character.toString(tictactoe.current.getSymbol());

				if(tictactoe.checkIfWinner()){
					String ret = sym + "WINS";
					return ret;
				}
				if(tictactoe.checkIfTie()){
					return "Tie";
				}
				else{
					tictactoe.makeMove(row, col);
					if(tictactoe.checkIfWinner()){
						String ret = sym + "WINS";
						return ret;
					}
					if(tictactoe.checkIfTie()){
						return "Tie";
					}
					return sym;
					
				}

			}


		});

	}
}
