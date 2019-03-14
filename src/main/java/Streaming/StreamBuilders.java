package Streaming;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuilders {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);

		}
	
		int even = 
			       list.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); 
			  
			    System.out.println(even); 
 
	}
}