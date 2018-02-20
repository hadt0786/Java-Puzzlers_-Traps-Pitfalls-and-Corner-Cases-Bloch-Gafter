import java.util.HashSet;
import java.util.Set;

public class Puzzle58MakingaHashofIt {
	private final String first, last;
	public Puzzle58MakingaHashofIt(String first, String last) {
	this.first = first; this.last = last;
	}
	public boolean equals(Puzzle58MakingaHashofIt n) {
	return n.first.equals(first) && n.last.equals(last);
	}
	public int hashCode() {
	return 31 * first.hashCode() + last.hashCode();
	}
	public static void main(String[] args) {
	Set<Puzzle58MakingaHashofIt> s = new HashSet<Puzzle58MakingaHashofIt>();
	s.add(new Puzzle58MakingaHashofIt("Donald", "Duck"));
	System.out.println(
	s.contains(new Puzzle58MakingaHashofIt("Donald", "Duck")));
	}
	/*public boolean equals(Object o) {
		if (!(o instanceof Puzzle58MakingaHashofIt))
		return false;
		Puzzle58MakingaHashofIt n = (Puzzle58MakingaHashofIt)o;
		return n.first.equals(first) && n.last.equals(last);
		}
	*/
	/*
	To avoid unintentional overloading, mechanically copy the declaration
	of each superclass method that you want to override*/
	@Override public boolean equals(Object o) {
		return o instanceof Puzzle58MakingaHashofIt && equals((Puzzle58MakingaHashofIt) o);
		}

}/*
Overloadings represent opportunities for error and confusion*/
