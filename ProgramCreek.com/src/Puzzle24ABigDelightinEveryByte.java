
public class Puzzle24ABigDelightinEveryByte {
	
	private static final byte TARGET = (byte)0x90;
	
	public static void main(String[] args) {
		for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
		if (b == 0x90)
			//Looks can be
			//deceiving. If you ran the program, you found that it prints nothing
		System.out.print("Joy!");
		/*
		 * 
		 * mixed-type comparison.
		 
		Appearances
		notwithstanding, it evaluates to false. To compare the byte value (byte)0x90 to
		the int value 0x90, Java promotes the byte to an int with a widening primitive
		conversion [JLS 5.1.2] and compares the two int values. Because byte is a signed
		type, the conversion performs sign extension, promoting negative byte values to
		numerically equal int values. In this case, the conversion promotes (byte)0x90
		to the int value -112, which is unequal to the int value 0x90, or +144.
		
		*/
		
		/*To pursue our fruit metaphor, you can choose to compare
apples to apples or oranges to oranges. You can cast the int to a byte, after
which you will be comparing one byte value to another:
*/
		
		
		if (b == (byte)0x90)
			System.out.println("Joy!");
		
		/*you can convert the byte to an int, suppressing sign extension
		with a mask, after which you will be comparing one int value to another:
		*/
		
		if ((b & 0xff) == 0x90)
			System.out.println("Joy!");
		/*
		//Either of these solutions works, but the best way to avoid this kind of problem
		is to move the constant value outside the loop and into a constant declaration*/
	
		/*it doesn’t compile. The constant declaration is broken, and the
		compiler will tell you the problem: 0x90 is not a valid value for the type byte.*/
		
		//private static final byte TARGET = 0x90; // Broken!
		
		/*private static final byte TARGET = (byte)0x90;*/ //in class declaration
		
		for (byte b1 = Byte.MIN_VALUE; b1 < Byte.MAX_VALUE; b++)
			if (b1 == TARGET)
			System.out.print("Joy!");
		
		
		
		}
		}
	
}
