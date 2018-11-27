import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupInArray {
	static void removeDuplicates(int[] arrayWithDuplicates) {
		System.out.println("Array With Duplicates : ");

		for (int i = 0; i < arrayWithDuplicates.length; i++) {
			System.out.print(arrayWithDuplicates[i] + "\t");
		}

		Set<Integer> set = new LinkedHashSet<Integer>(); 

		for (int i = 0; i < arrayWithDuplicates.length; i++) {
			set.add(arrayWithDuplicates[i]);
		}
		// Converting set into an array

		Object[] arrayWithoutDuplicates = set.toArray();

		// Printing arrayWithoutDuplicates

		System.out.println();

		System.out.println("Array Without Duplicates : ");

		for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
			System.out.print(arrayWithoutDuplicates[i] + "\t");
		}

		System.out.println();

		System.out.println("==============================");
	}

	public static void main(String[] args) {
		removeDuplicates(new int[] { 4, 3, 2, 4, 9, 2 });

	}
}