package lsystems;

public class A_A extends LRule {
	private char match;
	private char[] body;
	public A_A() {
		match = 'A';
		body = new char[] {'A'};
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
