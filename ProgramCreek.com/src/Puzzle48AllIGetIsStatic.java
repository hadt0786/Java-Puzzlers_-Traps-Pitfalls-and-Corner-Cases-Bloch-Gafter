
public class Puzzle48AllIGetIsStatic {
	class Dog {
		public static void bark() {
		System.out.print("woof ");
		}
		}
		class Basenji extends Dog {
		public static void bark() { }
		}
		public class Bark {
		public static void main(String args[]) {
		Dog woofer = new Dog();
		Dog nipper = new Basenji();
		woofer.bark();
		nipper.bark();
		}
		/*On casual inspection, it would appear that this program should just print woof. After
		all, Basenji extends Dog and defines its bark method to do nothing. The main
		method invokes the bark method, first on woofer the Dog and again on nipper the
		Basenji. Basenjis don’t bark, but apparently this one does. If you ran the program,
		you found that it prints woof woof.*/
		}
}
