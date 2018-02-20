import java.util.HashSet;
import java.util.Set;

public class Puzzle57WhatinaName {

	private final String first, last;
	public Puzzle57WhatinaName(String first, String last) {
	this.first = first;
	this.last = last;
	}
	public boolean equals(Object o) {
	if (!(o instanceof Puzzle57WhatinaName))
	return false;
	Puzzle57WhatinaName n = (Puzzle57WhatinaName)o;
	return n.first.equals(first) && n.last.equals(last);
	}
	public static void main(String[] args) {
	Set<Puzzle57WhatinaName> s = new HashSet<Puzzle57WhatinaName>();
	s.add(new Puzzle57WhatinaName("Mickey", "Mouse"));
	System.out.println(
	s.contains(new Puzzle57WhatinaName("Mickey", "Mouse")));
	}
	public int hashCode() {
		return 37 * first.hashCode() + last.hashCode();
		}
	}
	

