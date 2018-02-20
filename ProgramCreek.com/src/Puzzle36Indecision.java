
public class Puzzle36Indecision {

	
	public static void main(String[] args) {
		/*
		The reason is that in a try-finally statement, the finally block is always
		executed when control leaves the try block*/
		
		System.out.println(decision());
		}
		static boolean decision() {
		try {
		return true;
		} 
		
		finally {
		return false;
		}
		}
	
}
