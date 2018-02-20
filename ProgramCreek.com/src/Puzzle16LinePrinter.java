
public class Puzzle16LinePrinter {

	public Puzzle16LinePrinter() {
		// TODO Auto-generated constructor stub
	}
	/*
	The line separator is the name given to the character or characters used to separate
	lines of text, and varies from platform to platform. On Windows, it is the CR character
	(carriage return) followed by the LF character (linefeed). On UNIX, it is the
	LF character alone, often referred to as the newline character.*/

	public static void main(String[] args) {
		// Note: \u000A is Unicode representation of linefeed (LF)
		char c = 0x000A;
		System.out.println(c);
		// Note:
		//is Unicode representation of linefeed (LF)
		char c1 = 0x000A;
		System.out.println(c1);
		
		char c2 = '/n';
		System.out.println(c2);
	
	
	}
	
	
}
