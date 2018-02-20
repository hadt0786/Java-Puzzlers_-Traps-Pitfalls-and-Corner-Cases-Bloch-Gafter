
public class Puzzle39HelloGoodbye {
	public static void main(String[] args) {
		/*
		It is true that a finally block is executed when a try block completes execution
		whether normally or abruptly. In this program, however, the try block does
		not complete execution at all. The System.exit method halts the execution of
		the current thread and all others dead in their tracks. The presence of a
		finally clause does not give a thread special permission to continue executing.*/
		
		/*try {
		System.out.println("Hello world");
		System.exit(0);
		} finally {
		System.out.println("Goodbye world");
		}*/
			
		System.out.println("Hello world");
		Runtime.getRuntime().addShutdownHook(
		new Thread() {
		public void run() {
		System.out.println("Goodbye world");
		}
		});
		System.exit(0);
		/*Never call System.runFinalizersOnExit or
		Runtime.runFinalizersOnExit for any reason: They are among the most
		dangerous methods in the Java libraries [ThreadStop]. Calling these methods
		Puzzle 40: The Reluctant Constructor 85
		can result in finalizers being run on live objects while other threads are concurrently
		manipulating them, resulting in erratic behavior or deadlock.*/
	}
	
}
