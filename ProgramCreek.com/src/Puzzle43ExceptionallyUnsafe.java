/*
	Thread.stop, Thread.suspend, and a few other thread-related methods
were deprecated because they are unsafe [ThreadStop]. The following method
demonstrates one of the horrible things you could do with Thread.stop:*/

public class Puzzle43ExceptionallyUnsafe {
	// Don’t do this - circumvents exception checking!
	public static void sneakyThrow(Throwable t) {
	Thread.currentThread().stop(t); // Deprecated!!
	}/*
	This nasty little method does exactly what the throw statement does, except
	that it bypasses all exception checking by the compiler. You can (sneakily) throw
	any exception, checked or otherwise, from any point in your code, and the compiler
	won’t bat an eyelash.*/

	// Don’t do this either - circumvents exception checking!
	public static class Thrower {
	private static Throwable t;
	private Thrower() throws Throwable {
	throw t;
	}
	public static synchronized void sneakyThrow(Throwable t) {
	Thrower.t = t;
	try {
	Thrower.class.newInstance();
	} catch (InstantiationException e) {
	throw new IllegalArgumentException();
	} catch (IllegalAccessException e) {
	throw new IllegalArgumentException();
	} finally {
	Thrower.t = null; // Avoid memory leak
	}
	}
	}/*
	The documentation for Class.newInstance goes on to say that “the
	Constructor.newInstance method avoids this problem by wrapping any exception
	thrown by the constructor in a (checked) InvocationTargetException.”
	Clearly, Class.newInstance should have done the same thing, but it’s far too late
	to correct this deficiency. Doing so would introduce a source-level incompatibility,
	breaking the many programs that depend on Class.newInstance. It would
	not be practical to deprecate this method either, because it is so commonly used.
	Just be aware when you use it that Class.newInstance can throw checked
	exceptions that it does not declare.*/


	// Don’t do this either - circumvents exception checking!
	class TigerThrower<T extends Throwable> {
	public static void sneakyThrow(Throwable t) {
	new TigerThrower<Error>().sneakyThrow2(t);
	}
	private void sneakyThrow2(Throwable t) throws T {
	throw (T) t;
	}
	}
	/*This program will generate a warning when you compile it:
	TigerThrower.java:7: warning: [unchecked] unchecked cast
	found : java.lang.Throwable, required: T
	throw (T) t;
	^
	A warning is the compiler’s way of telling you that you may be shooting yourself
	in the foot, and in fact you are. The unchecked cast warning tells you that the
	cast in question will not be checked at run time. When you get an unchecked
	cast warning, modify your program to eliminate it, or convince yourself that
	the cast cannot fail. If you don’t, some other cast may fail at an undetermined
	time in the future, and you may have a hard time tracing the error to its source. In
	this case, it’s even worse:
*/

	




}
