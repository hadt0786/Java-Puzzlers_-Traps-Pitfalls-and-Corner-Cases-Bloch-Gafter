
public class Puzzle26IntheLoop {

	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;
	public static void main(String[] args) {
	int count = 0;
	/*for (int i = START; i <= END; i++)
	count++;
	System.out.println(count);*///no output infinite loop
	
	/*
	 * The problem is that the loop continues as long as the loop index (i) is less
than or equal to Integer.MAX_VALUE, but all int variables are always less than or
equal to Integer.MAX_VALUE. It is, after all, defined to be the highest int value in
existence. When i gets to Integer.MAX_VALUE and is incremented, it silently
wraps around to Integer.MIN_VALUE.
	 */
	/*
	More generally, the lesson here is that ints are not integers. Whenever you
	use an integral type, be aware of the boundary conditions. What happens if the
	value underflows or overflows? Often it is best to use a larger type. (The integral
	types are byte, char, short, int, and long.)*/
	for (long i = START; i <= END; i++)
		count++;
	System.out.println(count);
	
	
	//
	int i = START;
	do {
	count++;
	} while (i++ != END);
	
	
	// Apply the function f to all four billion int values
	int i1 = Integer.MIN_VALUE;
	do {
	f(i1);
	} while (i1++ != Integer.MAX_VALUE);
	
	
	
	
	
	
	
	
	
	}
	
}
