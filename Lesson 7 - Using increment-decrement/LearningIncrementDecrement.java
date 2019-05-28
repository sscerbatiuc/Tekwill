public class LearningIncrementDecrement {
	public static void main(String[] args) {
		int a = 1;
		int b = ++a + 3 * --a; // 2 + 3 * 1 = 5
		System.out.println("b=" + b);
		a = 1;
		b = --a * 5 + 7 - --a * 2; // 0 + 7 - -1 * 2  = 9
		System.out.println("b=" + b);

		a = 1;
		b = --a + a++ + ++a*5 - 7 * --a + 47; // 0 + 0 + 2*5 - 7 * 1 + 47=50;
		System.out.println("b=" + b);
		
	}
}