


	/*This puzzle tests your understanding of Java’s two classiest operators:
		instanceof and cast.*/
	
	public class Puzzle50NotYourType//type 1 {
	/*The first program, Type1, illustrates the behavior of the instanceof operator when
	applied to a null object reference. Although null is a subtype of every reference
	type, the instanceof operator is defined to return false when its left operand
	is null. Therefore, Type1 prints fals*/
		
		public static void main(String[] args) {
		String s = null;
		System.out.println(s instanceof String);
		}
	/*If instanceof tells you that an object reference is an instance of a
	particular type, you are assured that you can cast it to that type and invoke methods
	of the type without fear of a ClassCastException or a NullPointerException.*/
		}
		
		/*The second program, Type2, illustrates the behavior of the instanceof operator
		when testing an instance of one class to see whether it is an instance of an
		unrelated class. You might expect this program to print false. After all, an
		instance of Type2 isn’t an instance of String, so the test should fail, right? No.
		The instanceof test fails at compile time with an error message like this:
		Type2.java: inconvertible types
		found: Type2, required: java.lang.String
		System.out.println(new Type2() instanceof String);
		^
		The program fails to compile because the instanceof operator requires
		that if both operands are class types, one must be a subtype of the other*/
		
		
		 class Type2 {
		public static void main(String[] args) {
		System.out.println(new Type2() instanceof String);
		}
		}
		 class Type3 {
		/*
			 Type3, illustrates the behavior of the cast operator when
			 the static type of the expression to be cast is a superclass of the cast type. Like the
			 instanceof operation, if both types in a cast operation are class types, one must
			 be a subtype of the other. Although it is obvious to us that this cast will fail, the
			 type system is not powerful enough to know that the run-time type of the expression
			 new Object() cannot be a subtype of Type3. Therefore, the program throws
			 a ClassCastException at run time. This is a bit counterintuitive: The second program
			 makes perfect sense but doesn’t compile; this one makes no sense but does.*/
			 
			 public static void main(String args[]) {
		Type3 t3 = (Type3) new Object();
		}
		}
	

