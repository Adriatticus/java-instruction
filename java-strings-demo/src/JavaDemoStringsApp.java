import Util.MyConsole;

public class JavaDemoStringsApp {

	public static void main(String[] args) {
		MyConsole.printHeader("This isn't string cheese but it'll do");
		
		// p. 469 index,length, charAt
		String fullName = "Joseph Allen Hawes";
		// first, middle, last name?
		int firstSpaceIdx =fullName.indexOf(" ");
		MyConsole.printL("firstspace = "+firstSpaceIdx);
		int secondSpaceIdx = fullName.indexOf(" ", (firstSpaceIdx+1));
		MyConsole.printL("secondspace = "+secondSpaceIdx);
		
		
		// p. 471
		String firstName = fullName.substring(0, firstSpaceIdx);
		MyConsole.printL(firstName);
		String middleName = fullName.substring(firstSpaceIdx+1, secondSpaceIdx);
		MyConsole.printL(middleName);
		String lastName = fullName.substring(secondSpaceIdx+1);
		MyConsole.printL(lastName);
		
		// hangman hint - hiddenword
		
		String theWord = "happyhour";
		String hiddenWord = "_".repeat(theWord.length());
		MyConsole.printL("The word: "+theWord+".");
		MyConsole.printL("The hidden word: "+hiddenWord+".");
		
		MyConsole.printHeader("Resolve letters!");
		// loop unbtil all letters are guessed
		while (hiddenWord.indexOf("_") >= 0) {
			displayHiddenWord(hiddenWord);
			// guess a letter
			String guess = MyConsole.promptString("Letter guess: ");
			// resolve letter in hiddenWord OR display message incorrectGuess
			char[] chars = theWord.toCharArray();
			char[] hiddenChars = hiddenWord.toCharArray();
			if (theWord.indexOf(guess.charAt(0)) == -1) {
				MyConsole.printL("Incorrect guess");
			}
			else {
				for (int i = 0; i < chars.length; i++) {
					if (guess.charAt(0) == chars[i]) {
						hiddenChars[i] = guess.charAt(0);
					}
				}
			}
		}

		MyConsole.printL("\nThanks but I'll take the string cheese.");
	}

	private static void displayHiddenWord(String hiddenWord) {
		// display hiddenWord with spaces
		String hiddenWordDisplay = "";
		char[] chars = hiddenWord.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			hiddenWordDisplay += chars[i]+" ";
		}
		MyConsole.printL("Hidden word display = "+hiddenWordDisplay+".");
	}

}
