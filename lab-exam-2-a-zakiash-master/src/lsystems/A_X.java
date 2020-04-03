package lsystems;

public class A_X extends LRule {
	private char match;
	private char[] body;
	public A_X() {
		match = 'A';
		body = new char[] {};
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
