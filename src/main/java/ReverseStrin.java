import org.apache.commons.collections.set.SynchronizedSortedSet;

public class ReverseStrin {
	public static void main(String[] args) {
		String o = "Hello";
		char in[] = o.toCharArray();
		String result = "";

		for (int i = in.length - 1; i >= 0; i--) {
			result = result + o.charAt(i);

		}
		System.out.println(result);
	}
}
