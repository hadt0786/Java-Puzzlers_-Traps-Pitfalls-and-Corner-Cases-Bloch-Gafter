
public class Puzzle12ABC {

	public Puzzle12ABC() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		String letters = "ABC";
		char[] numbers = { '1', '2', '3' };
		System.out.println(letters + " easy as " + numbers);
		//print - [C@16f0472 UNICODE character
		//class object for char[] is the
		//string "[C".
		System.out.println(letters + " easy as " +
				String.valueOf(numbers));
		System.out.print(letters + " easy as ");
		System.out.println(numbers);
		System.out.println("---------");
		
		
		Object numberso = new char[] { '1','2','3' };
		System.out.print(letters + " easy as ");
		System.out.println(numberso); // Invokes println(Obje
		
		System.out.println("==========00");
		/*To convert a char array to a
		string, invokeString.valueOf(char[])*/
		
		
	
	
	}

}
