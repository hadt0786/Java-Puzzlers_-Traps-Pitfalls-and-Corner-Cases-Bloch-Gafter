

		/*This program has two immutable value classes, which are classes whose instances
represent values. One class represents a point on the plane with integer coordinates,
and the second class adds a bit of color to the puzzle*/

public class Puzzle51WhatthePoint {
	/*private final int x, y;
	private final String name; // Cached at construction time
	Puzzle51WhatthePoint(int x, int y) {
	this.x = x;
	this.y = y;
	name = makeName();
	}
	protected String makeName() {
	return "[" + x + "," + y + "]";
	}
	public final String toString() {
	return name;
	}
	}
	public class ColorPoint extends Puzzle51WhatthePoint {
	private final String color;
	ColorPoint(int x, int y, String color) {
	super(x, y);
	this.color = color;
	}
	protected String makeName() {
	return super.makeName() + ":" + color;
	}
	public static void main(String[] args) {
	System.out.println(new ColorPoint(4, 2, "purple"));
	}
	}//cached at construction

*/
	protected final int x, y;
	private String name; // Lazily initialized
	Puzzle51WhatthePoint(int x, int y) {
	this.x = x;
	this.y = y;
	// name initialization removed
	}
	protected String makeName() {
	return "[" + x + "," + y + "]";
	}}

/*
you must never call an overridable method from a constructor
under any circumstances. The resulting circularities in instance initialization can
be fatal. The solution to this problem is lazy initialization*/