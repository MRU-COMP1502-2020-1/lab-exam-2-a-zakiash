package lsystems;

public class C_B extends LRule {
	private char match;
	private char[] body;
	public C_B() {
		match = 'C';
		body = new char[] {'B'};
	}
	
	
	@Override
	public char getMatch() {
		// TODO Auto-generated method stub
		return match;
	}

	@Override
	public char[] getBody() {
		// TODO Auto-generated method stub
		return body;
	}
	
}
