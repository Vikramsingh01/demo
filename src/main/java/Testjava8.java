import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

interface Math {
	public Long calc(Long temp);
}

public class Testjava8 {

	public static void main(String[] args) {

		List<String> list = new ArrayList(Arrays.asList("a", "b", "f", "b", "d", "e", "b", "c", "f", "f"));
		
		Map<String, Long> map = list.stream().sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())); 
		System.out.println(map);
		
		Map<String, List<String>> phoneNumbers = new HashMap<String, List<String>>();
		phoneNumbers.put("John Lawson", Arrays.asList("3232312323", "8933555472"));
		phoneNumbers.put("Mary Jane", Arrays.asList("12323344", "492648333"));
		phoneNumbers.put("Mary Lou", Arrays.asList("77323344", "938448333"));

		Map<String, List<String>> filteredNumbers = phoneNumbers.entrySet().stream()
				.filter(x -> x.getKey().contains("John Lawson")).collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		
		filteredNumbers.forEach((key, value) -> {
			System.out.println("Name: " + key + ": ");
			value.forEach(System.out::println);
		});

	}

}