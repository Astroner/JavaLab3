package eugine;

import java.util.Arrays;
import java.util.HashSet;

import yui.Tester;

public class TextFinder{
	private Tester tester;
	public TextFinder(Tester _tester) {
		tester = _tester;
	}
	
	public HashSet<String> find(String text){
		HashSet<String> polindroms = new HashSet<String>();
		String[] words = text.split(" ");
		
		for(String word : words) {
			if(this.tester.test(word)) {
				polindroms.add(word);
			}
		}
		
		return polindroms;
	}
}
