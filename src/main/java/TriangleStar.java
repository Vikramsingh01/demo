
public class TriangleStar {
	public static void main(String[] args) {

		int n = 5;
		printTriagle(n);
	}

	public static void printTriagle(int n) {
		int num;
		int k = n;
		for (int i = 0; i < n; i++) {
			num = 1;
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k = k - 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}