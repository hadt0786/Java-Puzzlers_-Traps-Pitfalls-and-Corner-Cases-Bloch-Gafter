
public class Puzzle19ClassyFire {

	/*The following program uses a method to classify characters. What does the program
	print? In case you are not familiar with the String.indexOf(char) method,
	it returns the index of the first occurrence of the specified character in the string,
	or 􀀐1 if the string doesn’t contain the character:*/
	
	public Puzzle19ClassyFire() {
		// TODO Auto-generated constructor stub
	}
	/*The program doesn’t even compile.*/
	
	public static void main(String[] args) {
		System.out.println(
		classify(’n’) + classify(’+’) + classify(’2’));
		}
		static String classify(char ch) {
		if ("0123456789".indexOf(ch) >= 0)
		return "NUMERAL ";
		if ("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0)
		return "LETTER ";
		
		/* (Operators not supported yet)
		if ("+-&|!=".indexOf(ch) >= 0)
		return "OPERATOR ";
		*/
		return "UNKNOWN ";
		
	/*	
		/* Add the numbers from to 1 to n */
		int sum = 0;
		for (int i = 1; i <= n; i++)
		sum += i;
		
		
		
		}
		
		

}
