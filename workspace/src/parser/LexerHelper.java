package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String lexeme) {

		char charValue  = ' ';
		//  Carácter ASCII o especial
		if (lexeme.charAt(1) == '\\') {
			try {
				switch (lexeme.charAt(2)) {
					// Salto de línea
					case 'n': {
						charValue = '\n';
						break;
					}

					// Tabulador
					case 't': {
						charValue = '\t';
						break;
					}
					// Número
					default: {
						//  Carácter ASCII
						charValue = (char) Integer.parseInt(lexeme.substring(2, lexeme.length()-1));
						break;
					}
				}
			}
			catch (NumberFormatException nfe) {
				System.err.println( "Invalid Character" );
			}
		}
		else {
			// Carácter literal
			charValue = lexeme.charAt(1);
		}
		return charValue;
	}


	// TODswdqxzaO: Implement the lexemeToChar and lexemeToReal methods
	
}
