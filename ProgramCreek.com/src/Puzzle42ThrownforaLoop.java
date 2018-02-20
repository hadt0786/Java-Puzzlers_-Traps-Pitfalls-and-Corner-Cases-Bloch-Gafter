
public class Puzzle42ThrownforaLoop {

	public static void main(String[] args) {
		int[][] tests = { { 6, 5, 4, 3, 2, 1 }, { 1, 2 },
		{ 1, 2, 3 }, { 1, 2, 3, 4 }, { 1 } };
		int successCount = 0;
		try {
		int i = 0;
		while (true) {
		if (thirdElementIsThree(tests[i++]))
		successCount++;
		}
		} catch (ArrayIndexOutOfBoundsException e) {
		// No more tests to process
		}
		System.out.println(successCount);
		}
		private static boolean thirdElementIsThree(int[] a) {
		return a.length >= 3 & a[2] == 3;
		/*
		The program tests each element of the array tests with the thirdElementIsThree
		method. The loop through this array is certainly not traditional: Rather than terminating
		when the loop index is equal to the array length, the loop terminates when it
		attempts to access an array element that isn’t there. Although nontraditional, this
		loop ought to work. The thirdElementIsThree method returns true if its argument
		has three or more elements and the third element is equal to 3. This is true for
		two of the five int arrays in tests, so it looks as though the program should print 2.*/
		
		/*two mistakes
		
		The first mistake is that the program uses the
		hideous loop idiom that depends on an array access throwing an exception. This
		idiom is not only unreadable but also extremely slow. Do not use exceptions for
		loop control; use exceptions only for exceptional conditions [EJ Item 39]. To
		correct this mistake, replace the entire try-finally block with the standard idiom
		for looping over an array:*/
		
		for (int i = 0; i < tests.length; i++)
			if (thirdElementIsThree(tests[i]))
			successCount++;
		
		for (int[] test : tests)
			if (thirdElementIsThree(test))
			successCount++;
		
		/*
		If we fix the first mistake and run the program again, it fails
		with this stack trace:
		Exception in thread "main"
		java.lang.ArrayIndexOutOfBoundsException: 2
		at Loop.thirdElementIsThree(Loop.java:19)
		at Loop.main(Loop.java:13)*/
		/*
		there is a bug in the thirdElementIsThree method: It is throwing an
		ArrayIndexOutOfBoundsException. This exception was previously masquerading
		as the end of the hideous exception-based loop*/
		
		private static boolean thirdElementIsThree(int[] a) {
			return a.length >= 3 && a[2] == 3;
			}
		/*The | operator always evaluates
		both of its operands, whereas the || operator does not evaluate its right operand if
		its left operand evaluates to true.*/
		
		
		/*
		Be aware of the existence of the logical AND and OR operators,
		and do not fall prey to unintentional use. For language designers, this is another
		example where operator overloading is confusing. It is not clear that there is a case
		for providing the logical AND and OR operators in addition to their conditional
		counterparts. If these operators are to be supported, they should be visually distinct
		from their conditional counterparts*/
		
		}
		}


