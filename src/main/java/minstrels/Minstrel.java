package minstrels;

import java.io.PrintStream;

public class Minstrel {
	
	private PrintStream stream;
	
	public Minstrel( PrintStream stream ) {
		this.stream = stream;
	}
	
	public void singBeforeQuest() {
		stream.println( "The knight is getting ready for the quest!!");
	}
	
	public void singAfterQuest() {
		stream.println( "The brave knight complete his quest!!" );
	}
}
