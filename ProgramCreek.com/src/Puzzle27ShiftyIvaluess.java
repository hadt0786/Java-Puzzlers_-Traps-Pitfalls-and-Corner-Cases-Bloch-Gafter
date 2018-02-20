
public class Puzzle27ShiftyIvaluess {

	public static void main(String[] args) {
		
		/*this one contains a loop that keeps track of how
		many iterations it takes to terminate. Unlike that program, this one uses the leftshift
		operator (<<). As usual, your job is to figure out what the program prints.
		When you read it, remember that Java uses two’s-complement binary arithmetic,
		so the representation of 􀀐1 in any signed integral type (byte, short, int, or long)
		has all its bits se*/
		/*
		The constant -1 is the int value with all 32 bits set (0xffffffff). The left-shift
		operator shifts zeroes in from the right to fill the low-order bits vacated by the
		shift, so the expression (-1 << i) has its rightmost i bits set to 0 and the remaining
		32 - i bits set to 1. Clearly, the loop completes 32 iterations, as -1 << i is
		unequal to 0 for any i less than 32. You might expect the termination test to return
		false when i is 32, causing the program to print 32, but it doesn’t print 32. In
		fact, it doesn’t print anything but goes into an infinite loop*/
		/*
		The problem is that (-1 << 32) is equal to 􀀐1 rather than 0, because shift
		operators use only the five low-order bits of their right operand as the shift
		distance, or six bits if the left operand is a long [JLS 15.19]. This applies to all
		three shift operators: <<, >>, and >>>. The shift distance is always between 0 and
		31, or 0 and 63 if the left operand is a long. It is calculated mod 32, or mod 64 if
		the left operand is a long. Attempting to shift an int value 32 bits or a long value
		64 bits just returns the value itself. There is no shift distance that discards all 32
		bits of an int value or all 64 bits of a long value.*/
		
		
		/*int i = 0;
		while (-1 << i != 0)
		i++;
		System.out.println(i);not print any thing */
		
		int distance = 0;
		for (int val = -1; val != 0; val <<= 1)
		distance++;
		System.out.println(distance);
		
		/*In summary, shift distances are calculated mod 32 or, if the left operand is a
		long, mod 64. It is therefore impossible to shift away an entire value by using any
		shift operator or distance*/
	}
}
