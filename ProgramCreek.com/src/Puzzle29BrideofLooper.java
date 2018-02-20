
public class Puzzle29BrideofLooper {

	/*This value, known as NaN
	(short for “Not a Number”), is the value of all floating-point computations that do
	not have well-defined numeric values, such as 0.0 / 0.0. The specification says
	that NaN is not equal to any floating-point value, including itself
	*/
	
	
	public static void main(String[] args) {
		double i = 0.0 / 0.0;
	//	double i1 = Double.NaN;
		System.out.println(i - i == 0);
		}
	/*
	NaN is that once it
	generates NaN, a computation is damaged, and no further computation can
	repair the damage. The NaN value is intended to allow a damaged computation
	to proceed to a point where it is convenient to deal with the situation*/
	/*
	the float and double types have a special NaN value to represent
	a quantity that is not a number. The rules for computations involving NaN are
	simple and sensible, but the consequences of these rules can be counterintuitive*/
	
}
