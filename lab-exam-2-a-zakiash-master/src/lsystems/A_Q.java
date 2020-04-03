package lsystems;

public class A_Q extends LRule {
	private char match;
	private char[] body;
	public A_Q() {
		match = 'A';
		body = new char[] {'Q'};
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
