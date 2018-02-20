
public class Puzzle44CuttingClass//Strange 1 class {
	public static void main(String[] args) {
		try {
		Missing m = new Missing();
		} catch (java.lang.NoClassDefFoundError ex) {
		System.out.println("Got it!");
		}
		}
		
		public static class Strange2 {
		public static void main(String[] args) {
		Missing m;
		try {
		m = new Missing();
		} catch (java.lang.NoClassDefFoundError ex) {
		System.out.println("Got it!");
		}
		}
		}	
		class Missing {
			Missing() { }
			}

		/*To write a program that can detect when a class is missing, use reflection
		to refer to the class rather than the usual language constructs [EJ Item 35]. Here is
		how the program looks when rewritten to use this technique:
		public class Strange {
		public static void main(String[] args) throws Exception {
		try {
		Object m = Class.forName("Missing").newInstance();
		} catch (ClassNotFoundException ex) {
		System.err.println("Got it!");
		}
		}
		}*/
	
	}
