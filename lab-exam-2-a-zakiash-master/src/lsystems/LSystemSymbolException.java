package lsystems;

public class LSystemSymbolException extends Exception {
	
	private char symbol;
	
	public LSystemSymbolException(char symbol) {
		super();
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}
}
