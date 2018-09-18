import java.io.*;

// Java code to demonstrate number pattern
public class GeeksForGeeks {
	// Function to demonstrate printing pattern
	public static void printNums(int n) {
		int i, j, num=1;
		for (i = 0; i < n; i++) {
			num=1;
			for (j = 0; j <= i; j++) {
				
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[]) {
		int n = 5;
		printNums(n);
	}
}