
public class Puzzle28Looper {
	int start = Integer.MAX_VALUE - 1;
	for (int i = start; i <= start + 1; i++) {
	}
	while (i == i + 1) {
	}
	
	you represent infinity as a double or float. As we learned in school,
	infinity plus 1 is still infinity. If i is initialized to infinity before the loop starts, the
	termination test (i == i + 1) evaluates to true, and the loop never terminates
		
	double i = 1.0 / 0.0;
	Better yet, you can take advantage of a constant that is provided for you by the
	standard libraries:
	double i = Double.POSITIVE_INFINITY
	
	double i = 1.0e40;
	
	or the float type,
	the least magnitude beyond which adding 1 will have no effect is 225, or
	33,554,432; for the double type, it is 254, or approximately 1.8 × 1016.

	The distance between adjacent floating-point values is called an ulp, which is
	an acronym for unit in the last place

}
