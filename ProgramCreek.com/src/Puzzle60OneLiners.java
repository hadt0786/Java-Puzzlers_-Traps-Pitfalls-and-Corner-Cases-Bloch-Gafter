
public class Puzzle60OneLiners {
/*	A. Write a method that takes a List of elements and returns a new List containing
	the same elements in the same order with the second and subsequent
	occurrences of any duplicate elements removed. For example, if you pass in a list
	containing "spam", "sausage", "spam", "spam", "bacon", "spam", "tomato",
	and "spam", you’ll get back a new list containing "spam", "sausage", "bacon",
	and "tomato".*/

	/*A. It is well known that you can eliminate all the duplicate elements in a collection
	by putting its contents into a Set. In this puzzle, you were also asked to preserve
	the order of the original collection. Luckily, there is a Set implementation that
	maintains its elements in insertion order, and it offers near-HashMap performance
	to boot. It’s called LinkedHashSet, and it was added to the platform in release 1.4.
	Internally, it is implemented as a hash table with a linked list running through it.
	There is also a map version that you can use to make custom caches. Once you
	know about LinkedHashSet, it’s easy to solve this puzzle. The only other wrinkle
	is that you were asked to return a List, so you have to initialize a List with the
	contents of the LinkedHashSet. Putting it all together, here is the solution:
*/	
	static <E> List<E> withoutDuplicates(List<E> original) {
	return new ArrayList<E>(new LinkedHashSet<E>(original));
	/*
	B. Write a method that takes a string containing zero or more tokens separated
	by commas and returns an array of strings representing the tokens in the order
	they occur in the input string. Each comma may be followed by zero or more
	white space characters, which must be ignored by the method. For example, if you
	pass the string "fear, surprise, ruthless efficiency, an almost fanatical
	devotion to the Pope, nice red uniforms", you’ll get back a five-element
	string array containing "fear", "surprise", "ruthless efficiency", "an
	almost fanatical devotion to the Pope", and "nice red uniforms".
*/	
	
/*	When it comes to parsing a string into tokens, many programmers’
	thoughts turn immediately to StringTokenizer. This is most unfortunate, as
	StringTokenizer became obsolete as of release 1.4, when regular expressions
	were added to the platform (java.util.regex). If you tried to solve this puzzle
	with StringTokenizer, you quickly realized that it isn’t a very good fit. With regular
	expressions, it’s a snap. To solve this puzzle in one line, use the convenience
	method String.split, which takes a regular expression describing the token
	delimiter. If you haven’t used regular expressions before, they may look a bit cryptic,
	but they’re amazingly powerful and well worth learning:*/
	
	
	static String[] parse(String string) {
	return string.split(",\\s*");
	}
	/*
	C. Suppose that you have a multidimensional array that you want to print for
	debugging purposes. You don’t know how many levels the array has or what type
	of objects are stored at each level in the array. Write a method that shows you all
	the elements at each level.*/
	
	/*This is a trick question. You don’t even have to write a method. The
	method is provided for you in release 5.0 and later releases, and is called
	Arrays.deepToString. If you pass it an array of object references, it returns a
	nice string representation. It can deal with nested arrays and even circular references,
	where an array element refers to the enclosing array, directly or indirectly.
	In fact, the Arrays class in release 5.0 provides a whole family of toString,
	equals, and hashCode methods that allow you to print, compare, or hash the contents
	of any array of primitives or object references.
	*//*
	D. Write a method that takes two int values and returns true if the first value
	has more bits set than the second in its two’s-complement binary representation.*/
	
	/*In order to solve this puzzle in one line, you need to know that a whole
	family of bit-twiddling methods were added to the platform in release 5.0. The
	wrapper classes for the integral types (Integer, Long, Short, Byte, and Char)
	now support common bit-manipulation operations, including highestOneBit,
	lowestOneBit, numberOfLeadingZeros, numberOfTrailingZeros, bitCount,
	rotateLeft, rotateRight, reverse, signum, and reverseBytes. In this case,
	what you need is Integer.bitCount, which returns the number of set bits in an
	*/
	int value:
	static boolean hasMoreBitsSet(int i, int j) {
	return (Integer.bitCount(i) > Integer.bitCount(j));
	}
	
	
	
	
	
	
	
	
	}








}
