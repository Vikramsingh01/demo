package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*public class MissingNumberInArray 
{ 
    // Function to ind missing number 
    static int getMissingNo (int a[], int n) 
    { 
        int i, total; 
        total  = (n+1)*(n+2)/2;    
        for ( i = 0; i< n; i++) 
           total -= a[i]; 
        return total; 
    } 
    public static void main(String args[]) 
    { 
        int a[] = {1,2,3,5,6}; 
        int miss = getMissingNo(a,a.length); 
        System.out.println(miss);    
    }

	private static int getMissingNo(int[] a, int n) {
		int totalExp = (n+1)*(n+2)/2;
		 int totalActual = 0,missingNumber;
		for(int i=0;i<n;i++){
			 totalActual= a[i]+totalActual;
		}
		missingNumber=totalExp-totalActual;
		return missingNumber;
	} 
}*/

/*public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };

		int[] register = new int[input.length];

		for (int i : input) {
			register[i] = 1;
		}

		System.out.println("missing numbers in given array");
		for (int i = 1; i < register.length; i++) {
			if (register[i] == 0) {
				System.out.println(i);
			}
		}
	}
}
*/
public class MissingNumberInArray {

	public static void main(String[] args) {

		int input[]={ 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		duplicatesWithCount(input, input.length);
		
		
	}

	private static void duplicatesWithCount(int[] input, int length) {
		/*Map<Integer, Integer> map = new HashMap<>();
		for (int ikey : input) {
			if (map.containsKey(ikey)) {
				int counter = map.get(ikey);
				map.put(ikey, ++counter);
			} else {
				map.put(ikey, 1);
			}
		}*/
		/*for(Integer c : map.keySet()) {
            if(map.get(c) > 1) {
                System.out.println(c+" = "+map.get(c));
            }
        }*/
	
				//map.entrySet().stream().forEach(System.out::print);
		
		/*List<String> list = new ArrayList<>();
		list.add("one");
		list.add("one");
		list.add("two");*/
		//list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
		List<int[]> list = Arrays.asList(input); 
		list.stream().filter(i -> Collections.frequency(list, i) >1)
        .collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println(list);
		
	}

}
