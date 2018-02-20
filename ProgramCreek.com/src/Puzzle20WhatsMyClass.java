import java.util.regex.Pattern;

public class Puzzle20WhatsMyClass {

	/*print the name of its class file.*/
	
	public Puzzle20WhatsMyClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		System.out.println(
				Puzzle20WhatsMyClass.class.getName().replaceAll(".", "/") + ".class");
		/*
		The problem is that String.replaceAll takes a regular expression as its
		first parameter, not a literal sequence of characters
		The regular expression "." matches any
		single character, and so every character of the class name is replaced by a slash,
		producing the output we saw.*/
		
		System.out.println(
				Puzzle20WhatsMyClass.class.getName().replaceAll("\\.", "/") + ".class");
		
	/*	import java.util.regex.Pattern;*/
		
		System.out.println(Puzzle20WhatsMyClass.class.getName().
				replaceAll(Pattern.quote("."), "/") + ".class");
		
		
		}

}
