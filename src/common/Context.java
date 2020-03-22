package common;

public class Context implements IContext {
		
	private Output out;
	
	public Context(Output out) {
		this.out = out;
	}
		
	public void setOutput(Output out) {
		this.out = out;
	}
	
	public void write(String str) {
		this.out.print(str);
	}
	
}
