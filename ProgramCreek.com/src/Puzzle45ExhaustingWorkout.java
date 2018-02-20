
public class Puzzle45ExhaustingWorkout {
	public static void main(String[] args) {
		workHard();
		System.out.println("It’s nap time.");
		}
		private static void workHard() {
		try {
		workHard();
		} finally {
		workHard();
		}
		}
		/*It results eventually in a
		StackOverflowError. A pattern appears to be emerging, and indeed it is.*/
			
		/*How much bigger? A quick experiment shows that many VMs limit stack depth
				to 1,024. The number of calls is therefore 1 + 2 + 4 + 8… + 21,024 = 21,025 􀀐 1. The
				number of exceptions thrown is 21,024. Let’s assume that our machine can execute
				1010 calls per second and generate 1010 exceptions per second, which is quite generous
				by current standards. Under these assumptions, the program will terminate
				in about 1.7 × 10291 years.
*/
}

