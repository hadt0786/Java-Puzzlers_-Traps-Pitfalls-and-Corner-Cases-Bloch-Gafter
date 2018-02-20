import java.util.HashMap;
import java.util.Map;

public class Puzzle63MoreoftheSame {
			
	private Map<String,String> m = new HashMap<String,String>();
/*	simple as removing the void return type from the
			MoreNames declaration, which turns it from an instance method declaration into a
			constructor declaration. With this change, the program prints 1 as expected.*/
	
	public void Puzzle63MoreoftheSame() {
	m.put("Mickey", "Mouse");
	m.put("Mickey", "Mantle");
	}
	public int size() {
	return m.size();
	}
	public static void main(String args[]) {
		Puzzle63MoreoftheSame moreNames = new Puzzle63MoreoftheSame();
	System.out.println(moreNames.size());
	}/*
	Don’t accidentally turn a constructor declaration
	into a method declaration by adding a return type.*/
}
