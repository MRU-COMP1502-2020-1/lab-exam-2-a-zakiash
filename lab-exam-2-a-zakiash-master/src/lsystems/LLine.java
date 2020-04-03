package lsystems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;

	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		Set<Character> validChars = new HashSet<>();
		for (LRule rule : rules) {
			validChars.add(rule.getMatch());
		}
		
		char invalidChar = ' ';
		for (char i : line) {
			if (!validChars.contains(i)) {
				invalidChar = i;
			}
		}
		
		if (line.length == 0) throw new LSystemLengthException();
		if (invalidChar != ' ') throw new LSystemSymbolException(invalidChar);
		
		List<Character> lineList = new ArrayList<>();
		for (char i : line) {
			lineList.add(i);
		}
		
		for(int i = 0; i < lineList.size();i++) {
			for (LRule e : rules) {
				if (e.getMatch() == lineList.get(i)) {
					char[] arrayreplace = e.getBody();
					if (e.getBody().length == 0) {
						lineList.remove(i);
						break;
					} else if (e.getBody().length == 1) {
						lineList.set(i, arrayreplace[0]);
						break;
					} else if (e.getBody().length == 2) {
						lineList.set(i, arrayreplace[0]);
						lineList.add(i + 1, arrayreplace[1]);
						i++;
						break;
					}
					
				}
			}
			
		}
		line = listToArray(lineList);
		List<Character> l = new ArrayList<>();
		for (char i : lineList) {
			l.add(i);
		}
	}
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
