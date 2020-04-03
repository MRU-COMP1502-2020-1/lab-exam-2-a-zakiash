package lsystems;

public class B_A extends LRule {
	private char match;
	private char[] body;
	public B_A() {
		match = 'B';
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
