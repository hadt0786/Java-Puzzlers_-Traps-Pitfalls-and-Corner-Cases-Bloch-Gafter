
public class Puzzle14EscapeRout {

	/*Unicode escapes*/
	
	
	
	public Puzzle14EscapeRout() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// \u0022 is the Unicode escape for double quote (")
		System.out.println("a\u0022.length() + \u0022b".length());
		
		/*Java provides no special treatment
		for Unicode escapes within string literals.
		The compiler translates Unicode
		escapes into the characters they represent before it parses the program into
		tokens, such as strings literals
		Therefore, the first Unicode escape in the
		program closes a one-character string literal ("a"), and the second one opens a
		one-character string literal ("b"). The program prints the value of the expression
		"a".length() + "b".length(), or 2.*/
		
		System.out.println("a".length() + "b".length());
		
		/*The escape sequence representing a double quote
		is a backslash followed by a double quote (\").
*/	
	/*
		If the Unicode escapes in the original
		program are replaced with this escape sequence, it will print 16 as expected:
		*/
	
		System.out.println("a\".length() + \"b".length());
		
	/*	There are escape sequences for many characters, including the single quote
		(\’), linefeed (\n), tab (\t), and backslash (\\).*/
	
		/*ASCII has only 128
		characters, but Unicode has more than 65,000.*/
	/*
		prefer escape sequences to Unicode escapes in string and
		character literals. Unicode escapes can be confusing because they are processed
		so early in the compilation sequence. Do not use Unicode escapes to represent
		ASCII characters. Inside of string and character literals, use escape sequences;
		outside of these literals, insert ASCII characters directly into the source file.*/
	
		
	
	
	
	
	
	
	
	}

}
