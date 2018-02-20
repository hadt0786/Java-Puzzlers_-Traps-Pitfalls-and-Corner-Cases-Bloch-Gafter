import java.util.IdentityHashMap;
import java.util.Map;

public class Puzzle62TheNameGame {
	public static void main(String args[]) {
		Map<String, String> m =
		new IdentityHashMap<String, String>();
		m.put("Mickey", "Mouse");
		m.put("Mickey", "Mantle");
		System.out.println(m.size());
		}
}
/*
Don’t use IdentityHashMap unless
you need its identity-based semantics; it is not a general-purpose Map implementation.
These semantics are useful for implementing topology-preserving
object graph transformations, such as serialization or deep-copying*/