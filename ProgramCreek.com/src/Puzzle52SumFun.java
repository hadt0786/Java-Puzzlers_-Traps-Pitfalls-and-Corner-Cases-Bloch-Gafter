
public class Puzzle52SumFun {
	
	
		/*static {
		initializeIfNecessary();
}
		private static int sum;
		public static int getSum() {
		initializeIfNecessary();
		return sum;
		}
		private static boolean initialized = false;
		private static synchronized void initializeIfNecessary() {
		if (!initialized) {
		for (int i = 0; i < 100; i++)
		sum += i;
		initialized = true;
		}
		}
		}
		public static class Client {
		public static void main(String[] args) {
		System.out.println(Puzzle52SumFun.getSum());
		}
		}*/

	private static final int sum = computeSum();
	private static int computeSum() {
	int result = 0;
	for (int i = 0; i < 100; i++)
	result += i;
	return result;
	}
	public static int getSum() {
	return sum;
	}
	}
/*
think about class initialization order, especially when it is
nontrivial.*/