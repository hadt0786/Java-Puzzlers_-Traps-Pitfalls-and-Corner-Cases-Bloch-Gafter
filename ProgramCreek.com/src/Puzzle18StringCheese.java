
public class Puzzle18StringCheese {

	public Puzzle18StringCheese() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*
		This program creates a string from a sequence of bytes, then iterates over the characters
		in the string and prints them as numbers.*/
		
		
		/*The culprit here is the String(byte[]) constructor. Its specification says:
			“Constructs a new String by decoding the specified byte array using the platform’s
			default charset. The length of the new String is a function of the charset,
			and hence may not be equal to the length of the byte array. The behavior of this
			constructor when the given bytes are not valid in the default charset is unspecified”
			*/
		byte[] bytes = new byte[256];
		for(int i = 0; i < 256; i++)
		bytes[i] = (byte)i;
		String str = new String(bytes);
		for(int i = 0, n = str.length(); i < n; i++)
		System.out.print((int)str.charAt(i) + " ");
		}
}
