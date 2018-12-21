
public class DupValuesArray {
	public static int count(String[] array, String item) {
	    int count = 0;
	 
	    if (item == null) {
	        for (String s : array) {
	            if (s == null) count++;
	        }
	    } else {
	        for (String s : array) {
	            if (item.equals(s)) {
	                count++;
	            }
	        }
	    }
	 
	    return count;
	 
	}
	
public static void main(String[] args) {
	String[] helloWorld = {"h", "e", "l", "l", "o", "w", "o", "r", "l", "d"};
	int count = count(helloWorld, "");
	System.out.println("#occurrences of l: " + count);
}
}
