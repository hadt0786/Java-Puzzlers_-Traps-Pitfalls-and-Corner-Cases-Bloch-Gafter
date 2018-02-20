import java.io.File;

public class Puzzle21WhatsMyClass2 {

	
	public static void main(String[] args) {
		/*
		This program does exactly what the one in the previous puzzle did, but doesn’t
		assume that the slash character is used to separate filename components. Instead,
		the program uses java.io.File.separator, which is a public String field specified
		to contain the platform-specific filename separator.*/
		
		System.out.println(Puzzle21WhatsMyClass2.class.getName().
				replaceAll("\\.", File.separator) + ".class");
		
		/*If the file separator is a slash, as it is on UNIX, the program prints com/
		javapuzzlers/MeToo.class*/
		
/*		on Windows, the program prints something like this:
			Exception in thread "main"
			StringIndexOutOfBoundsException: String index out of range: 1
			at java.lang.String.charAt(String.java:558)
			at java.util.regex.Matcher.appendReplacement(Matcher.java:696)
			at java.util.regex.Matcher.replaceAll(Matcher.java:806)
			at java.lang.String.replaceAll(String.java:2000)
			at com.javapuzzlers.MeToo.main(MeToo.java:6)*/
		
		System.out.println(Puzzle21WhatsMyClass2.class.getName().
				replace(".", File.separator) + ".class");
		
		
	}

}
