
public class Puzzle40TheReluctantConstructor {

	private Puzzle40TheReluctantConstructor internalInstance = new Puzzle40TheReluctantConstructor();
	
	public Puzzle40TheReluctantConstructor()  {
		throw new Exception("I’m not coming out");
	}

	public static void main(String[] args) {
		try {
			Puzzle40TheReluctantConstructor b = new Puzzle40TheReluctantConstructor();
			System.out.println("Surprise!");
			} catch (Exception ex) {
			System.out.println("I told you so");
			}
			}
	
	public class Car {
		private static Class engineClass = ... ; // Service provider
		private Engine engine = (Engine) engineClass.newInstance();
		public Car() { } // Throws two checked exceptions!
		}
		/*Although it has no body, the constructor throws two checked exceptions:
		InstantiationException and IllegalAccessException. They are thrown by
		Class.newInstance, which is called when initializing the engine field. The best
		way to fix this is to create a private static helper method that computes the initial
		value of the field and handles exceptions appropriately. In this case, let’s assume that
		the Class object referred to by engineClass was chosen to guarantee that it is both
		accessible and instantiable.
	*/
	
	/*public class Car {
		private static Class engineClass = ... ;
		private Engine engine = newEngine();
		private static Engine newEngine() {
		try {
		return (Engine) engineClass.newInstance();
		} catch (IllegalAccessException e) {
		throw new AssertionError(e);
		} catch (InstantiationException e) {
		throw new AssertionError(e);
		}
		}
		public Car() { }
		}
	
	
*/	}


