
public class Puzzle13AnimalFarm {

	public Puzzle13AnimalFarm() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		
		/*The ==
				operator, however, does not test whether two objects are equal; it tests whether
				two object references are identical. In other words, it tests whether they refer to
				precisely the same object. In this case, they do not.
		*/
		
		System.out.println("Animals are equal: "
		+ pig == dog);
		
		/*When using the string concatenation operator, always parenthesize nontrivial
		operands*/
		System.out.println(("Animals are equal: " + pig) == dog);
		
		System.out.println("Animals are equal: " + (pig == dog));
		
		/*use the equals method in
		preference to the == operator unless you need to compare object identity rather
		than value*/
		
		System.out.println("Animals are equal: " + pig.equals(dog));
	/*	One way to
		achieve this would be to make the == operator a shorthand for the equals method,
		and to provide a separate method to perform reference identity comparison, akin
		to System.identityHashCode.*/
		
		System.identityHashCode(dog);
		
		
		}
	
}
