
public class Puzzle55Creationism {
	/*
	The program looks as though it ought to print 100, but it
	doesn’t print anything, because it doesn’t compile. If you tried to compile it, you
	may have found the compiler diagnostics to be less than helpful. This is what
	javac prints:
	Creator.java:4: not a statement
	Creature creature = new Creature();
	^
	Creator.java:4: ’;’ expected
	Creature creature = new Creature();*/
	
	public static void main(String[] args) {
		/*for (int i = 0; i < 100; i++)
			Puzzle55Creationism creature = new Puzzle55Creationism();
		System.out.println(Puzzle55Creationism.numCreated());
		}
		}
		class Puzzle55Creationism {
		private static long numCreated = 0;
		public Creature() {
		numCreated++;
		}
		public static long numCreated() {
		return numCreated;
		}
		*/
		
		for (int i = 0; i < 100; i++) {
			Puzzle55Creationism creature = new Puzzle55Creationism();
		/*//for (int i = 0; i < 100; i++)
			new Creature();*/
		//// Thread-safe creation counter using AtomicLong;
			import java.util.concurrent.atomic.AtomicLong;
			class Creature {
			private static AtomicLong numCreated = new AtomicLong();
			public Creature() {
			numCreated.incrementAndGet();
			}
			public static long numCreated() {
			return numCreated.get();
			}
			/*
			when using a variable to count instance creations, use a long
			rather than an int, to prevent overflow*/
			}
		
		

