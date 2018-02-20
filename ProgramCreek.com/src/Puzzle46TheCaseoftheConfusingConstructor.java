
public class Puzzle46TheCaseoftheConfusingConstructor {
	
	/*
	The parameter passed to the constructor is the null object reference, so at first
	glance, it seems that the program should invoke the Object overloading and print
	Object. On the other hand, arrays are reference types too, so null could just as well
	apply to the double[] overloading.*/
	
	
	private Puzzle46TheCaseoftheConfusingConstructor(Object o) {
		System.out.println("Object");
		}
		private Puzzle46TheCaseoftheConfusingConstructor(double[] dArray) {
		System.out.println("double array");
		}
		public static void main(String[] args) {
		new Puzzle46TheCaseoftheConfusingConstructor(null);
		}
		/*
		Java’s overload resolution process operates in two phases. The first phase
		selects all the methods or constructors that are accessible and applicable. The second
		phase selects the most specific of the methods or constructors selected in the
		first phase. One method or constructor is less specific than another if it can accept
		any parameters passed to the other*/
		/*
		program, both constructors are accessible and applicable. The constructor
		Confusing(Object) accepts any parameter passed to Confusing(double[]),
		so Confusing(Object) is less specific. (Every double array is an Object, but not
		every Object is a double array.) The most specific constructor is therefore
		Confusing(double[]), which explains the program’s output.*/
		
		
		
		





}
	

