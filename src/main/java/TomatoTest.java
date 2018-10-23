import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TomatoTest {
	public static void main(String[] args) {

		String str1 = "tomato";
		char[] chars = str1.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char c : chars) {
			if (map.containsKey(c)) {
				int counter = map.get(c);
				map.put(c, ++counter);
			} else {
				map.put(c, 1);
			}
		}
		for(char c : map.keySet()) {
            if(map.get(c) > 1) {
                System.out.println(c);
            }
        }
		TreeMap<Character, Integer> tm = new TreeMap<>(map);
System.out.println(tm);
		List<Holder> list = new ArrayList<>();

		for (Entry<Character, Integer> ent : tm.entrySet()) {
			Holder hold = new Holder();
			hold.ch = ent.getKey();
			hold.val = ent.getValue();
			list.add(hold);

		}
		Collections.sort(list, new HolderComparator());
		list.stream().map(Holder::getCh).forEach(System.out::print);

	}
}

class Holder {
	char ch;
	Integer val;

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}

}

class HolderComparator implements Comparator<Holder> {

	@Override
	public int compare(Holder one, Holder two) {
		if (one.val > two.val) {
			return -1;
		} else if (one.val < two.val) {
			return 1;
		} else {
			return 0;
		}
	}

}
