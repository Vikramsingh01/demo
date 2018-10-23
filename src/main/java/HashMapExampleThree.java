import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapExampleThree {
	public static void main(String[] args) throws IOException {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input count: ");
		int valueCount = Integer.valueOf(br.readLine());
		System.out.println("Enter the values: ");
		for (int i = 0; i < valueCount; i++) {
			String value = br.readLine();
			map.put(i, value);
		}

		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		System.out.println("Enter the key : ");
		try {
			int key = Integer.valueOf(br.readLine());

			while (itr.hasNext()) {
				Entry<Integer, String> entry = itr.next();
				if (entry.getKey() == key) {
					System.out.println("Here we go!!!     -> " + entry.getValue());
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("You have entered a invalid key, Enter  a valid key");
		}
	}
	/*
	 * Set<Entry<String, Integer>> entryS = map.entrySet();
	 * 
	 * for (Entry<String, Integer> entry : entryS) {
	 * System.out.println(entry.getKey()+" : "+entry.getValue()); }
	 */
	/*
	 * for (Entry<String, Integer> entry : map.entrySet())
	 * System.out.println("Key = " + entry.getKey() + ", Value = " +
	 * entry.getValue());
	 */
}
