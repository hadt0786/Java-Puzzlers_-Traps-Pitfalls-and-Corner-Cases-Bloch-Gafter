import java.util.Calendar;

public class Puzzle49LargerThanLife//elvis class {
		
	public static final Puzzle49LargerThanLife INSTANCE = new Puzzle49LargerThanLife();
	private final int beltSize;
	private static final int CURRENT_YEAR =
	Calendar.getInstance().get(Calendar.YEAR);
	private Puzzle49LargerThanLife() {
	beltSize = CURRENT_YEAR - 1930;
	}
	public int beltSize() {
	return beltSize;
	}
	public static void main(String[] args) {
	System.out.println("Elvis wears a size " +
	INSTANCE.beltSize() + " belt.");

	/*
	To fix a class initialization cycle,
	reorder the static field initializers so that each initializer appears before any
	initializers that depend on it. In this program, the declaration for CURRENT_YEAR
	belongs before the declaration for INSTANCE, because the creation of an Elvis*/
	
	
	
	
	}
	




}
	

