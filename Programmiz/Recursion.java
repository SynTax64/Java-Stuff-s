
public class Recursion {
	static int factorial(int n) {
		if (n != 0) // termination condition
			return n * factorial(n - 1); // recursive call
		else
			return 1;
	}

	public static void main(String[] args) {
		factorial(10);
	}
}
