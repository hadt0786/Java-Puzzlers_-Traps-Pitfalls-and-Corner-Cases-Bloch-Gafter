import java.util.Random;

public class Puzzle23NoPainNoGain {
/*
	This program prints a word, using a random number generator to select the first
	character*/
	
	private static Random rnd = new Random();
	public static void main(String[] args) {
	StringBuffer word = null;
	switch(rnd.nextInt(2)) {
	case 1: word = new StringBuffer('P');
	case 2: word = new StringBuffer('G');
	default: word = new StringBuffer('M');
	}
	word.append('a');
	word.append('i');
	word.append('n');
	System.out.println(word);
/*	
	this program might appear to print out the words Pain, Gain, and
	Main with equal likelihood, varying from run to run. It appears to choose the first
	letter of the word, depending on the value chosen by the random number generator:
	M for 0, P for 1, and G for 2.
	
	more surprisingly, it
	doesn’t print Main either, and its behavior doesn’t vary from run to run. It always
	prints ain.
	
	Three bugs
	The first
	bug is that the random number is chosen so the switch statement can reach only
	two of its three cases.
	Random.nextInt(int) says: “Returns
	a pseudorandom, uniformly distributed int value between 0 (inclusive) and the
	specified value (exclusive)
	This means that the only possible values
	of the expression rnd.nextInt(2) are 0 and 1. The switch statement will never
	branch to case 2, which suggests that the program will never print Gain. The
	parameter to nextInt should have been 3 rather than 2.
	
	fencepost error - If you
	build a fence 100 feet long with posts 10 feet apart, how many posts do you need?
			Both 11 and 9 are correct answers, depending on whether there are posts at the
			ends of the fence, but 10 is wrong. Watch out for fencepost errors
	
			Whenever
			you are working with lengths, ranges, or moduli, be careful to determine which
			endpoints should be included, and make sure that your code behaves accordingly
	
	
			The second bug
			no break statements between the cases.
			Whatever the value of the switch expression, the program will execute that case
			and all subsequent cases
			Each case assigns a value to the variable
			word, and the last assignment wins. The last assignment will always be the one in
			the final case (default), which is new StringBuffer(’M’). This suggests that the
			program will never print Pain or Gain but always Main
			
		Don’t fall through from one nonempty case to another. It’s bad style because
it’s unusual and therefore confusing to the reader. Nine times out of ten, it indicates
an error.

			The last and most subtle bug
			StringBuffer(char) constructor, and with good reason: It does not exist. There
is a parameterless constructor, one that takes a String indicating the initial contents
of the string buffer and one that takes an int indicating its initial capacity. In
this case, the compiler selects the int constructor, applying a widening primitive
conversion to convert the char value ’M’ into the int value 77
			In
other words, new StringBuffer(’M’) returns an empty string buffer with an initial
capacity of 77. The remainder of the program appends the characters a, i, and
n to the empty string buffer and prints out its contents, which are always ain.

			which are always ain.
To avoid this kind of problem, use familiar idioms and APIs whenever possible.
If you must use unfamiliar APIs, read the documentation carefully. In
this case, the program should have used the common StringBuffer constructor
that takes a String.

			*
			*
			*/
			
			
	StringBuffer word1 = null;
	switch(rnd.nextInt(3)) {
	case 1:
	word1 = new StringBuffer("P");//string not characters
	break;
	case 2:
	word1 = new StringBuffer("G");
	break;
	default:
	word1 = new StringBuffer("M");
	break;
	}
	word1.append('a');
	word1.append('i');
	word1.append('n');
	System.out.println(word1);
	
	
	//
	
	System.out.println("PGM".charAt(rnd.nextInt(3)) + "ain");
	//
	
	String a[] = {"Main", "Pain", "Gain"};
	System.out.println(randomElement(a));}
	private static Random rnd1 = new Random();
	private static String randomElement(String[] a) {
	return a[rnd1.nextInt(a.length)];
	/*
	First, be careful of fencepost errors. Second, remember to put
	a break after each case in switch statements. Third, use common idioms and
	APIs, and consult the documentation when you stray from the well-worn path.
	Fourth, a char is not a String but is more like an int*/
	
	}
	}