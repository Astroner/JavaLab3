import java.util.Arrays;
import java.util.HashSet;

import eugine.TextFinder;
import yui.Generator;
import yui.PolindromTester;
import yui.TextGenerator;

public class Main {

	public static void main(String[] args) {
		int wordCount = 100;
		int wordLength = 4;
		
		TextGenerator generator = new Generator();
		
		String text = generator.generateText(wordCount, wordLength);

		TextFinder finder = new TextFinder(new PolindromTester());
		
		HashSet<String> polindroms = finder.find(text);
		
		System.out.println("Text: ");
		System.out.println(text);
		System.out.println("Polindroms: " + Arrays.toString(polindroms.toArray()));
	}

}
