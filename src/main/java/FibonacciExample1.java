import java.util.Arrays;

class FibonacciExample1 {
	public boolean main(int n) {

		if (n <= 0) {
			return false;
		}
		int n1 = 0, n2 = 1, n3, i;
		n = n + 1;
		int[] fibos = new int[n];
		fibos[0] = n1;
		fibos[1] = n2;
		for (i = 2; i < n; ++i)// loop starts from 2 because 0 and 1 are
		{
			n3 = n1 + n2;
			if (n > n3) {
				fibos[(int) i] = n3;
			}
			n1 = n2;
			n2 = n3;
		}

		double d = n / 2;
		int[] array1 = Arrays.stream(fibos).filter(f -> f >= d).toArray();
		int[] array2 = Arrays.stream(fibos).filter(f -> f <= d).toArray();

		for (int p : array1) {
			for (int q : array2) {
				if (p + q == n) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		boolean main = new FibonacciExample1().main(5);
		System.out.println(main);
	}
}