package lsystems;

public class A_AA extends LRule {
	private char match;
	private char[] body;
	public A_AA() {
		match = 'A';
		body = new char[] {'A', 'A'};
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
