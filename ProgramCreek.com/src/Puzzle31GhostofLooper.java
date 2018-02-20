
public class Puzzle31GhostofLooper {

	/*Recall that >>>= is the assignment operator corresponding to the unsigned
			right-shift operator. Zeros are shifted in from the left to fill bits vacated by the
			shift, even if the value being shifted is negative.*/
	
	public static void main(String[] args) {
	int i;
	while (i != 0)
		i >>>= 1;
/*		do not use compound assignment operators on short, byte,
		or char variables. Such expressions perform mixed-type arithmetic, which can
		be confusing in and of itself. Far worse, they perform an implicit narrowing cast,
		which can discard information. The results can be disastrous.*/
	}
}
