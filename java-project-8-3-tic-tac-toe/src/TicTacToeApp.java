import Util.MyConsole;

public class TicTacToeApp {
	
	static String horizontal = "+---+---+---+";
	
	static String [][] game = {{"1", "2", "3"},
			                   {"4", "5", "6"},
			                   {"7", "8", "9"}};

	public static void main(String[] args) {
		MyConsole.printHeader("Was that a tic, a tac, or a toe?");
		MyConsole.printL("");
		// display board
		String tttBoard = """
				+---+---+---+
				|   |   |   |
				+---+---+---+
				|   |   |   |
				+---+---+---+
				|   |   |   |
				+---+---+---+
				""";
		MyConsole.print(tttBoard);
		
		boolean winner = false;
		while (!winner) {
			// altername between x and o
			// display board
			// get user entry (position on board)
			//place x/o on board
			
		}
		
		String vertical = "|   |   |   |";
		
		String hor = horizontal + "\n";
		String vert = vertical + "\n";
		for (i = 0; i < 3; i++) {
			// horizontal += vertical '' ''
		}
		MyConsole.printL(i);
		
		// 2 d array example
		
		
		String gameString = horizontal +"\n";
		// loop through the rows
		for (int h = 0; h < game.length; h++) {
			//loop through the columns
			gameString += "|";
			for (int v = 0; v < game[i].length; v++) {
				gameString += " " + (game[h][v] + " ");
			}
			MyConsole.printL(gameString);
		}
		MyConsole.print(game);

		MyConsole.printHeader("\nIt was the whole foot.");
	}
	

}

