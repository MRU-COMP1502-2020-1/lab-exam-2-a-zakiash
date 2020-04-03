package lsystems;

public class A_BC extends LRule {
	private char match;
	private char[] body;
	public A_BC() {
		match = 'A';
		body = new char[] {'B', 'C'};
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
