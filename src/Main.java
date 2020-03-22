import common.CMDOutput;
import common.Context;
import yui.Generator;
import yui.TextGenerator;

public class Main {

	public static void main(String[] args) {
		int wordCount = 100;
		int wordLength = 4;
		
		TextGenerator generator = new Generator();
		Context contex = new Context(new CMDOutput());
		
		String text = generator.generateText(wordCount, wordLength);
			
		
	}

}
