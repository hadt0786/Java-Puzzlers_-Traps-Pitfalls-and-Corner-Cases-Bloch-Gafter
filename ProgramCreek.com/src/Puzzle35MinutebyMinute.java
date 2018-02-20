
public class Puzzle35MinutebyMinute {
	
	private static final int MS_PER_HOUR = 60 * 60 * 1000;
	private static final int MS_PER_MINUTE = 60 * 1000;
	
	public static void main(String[] args) {
		int minutes = 0;
		for (int ms = 0; ms < 60*60*1000; ms++)
		if (ms % 60*1000 == 0)
		minutes++;
		System.out.println(minutes);
		
	/*	The problem lies in the boolean expression (ms % 60*1000 == 0). You might
		think that this expression is equivalent to (ms % 60000 == 0), but it isn’t. The
		remainder and multiplication operators have the same precedence
	*/
		
		int minutes1 = 0;
		for (int ms = 0; ms < MS_PER_HOUR; ms++)
		if (ms % MS_PER_MINUTE == 0)
		minutes1++;
		System.out.println(minutes1);
	}
	
}
