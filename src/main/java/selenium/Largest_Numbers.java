import java.util.Scanner;

public class Largest_Numbers {
	public static void TwoMaxNumbers(int[] nums){
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:nums){
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
    }
     
    public static void main(String a[]){
        int num[] = {5,34,78,2,45,1,99,23};
       
        Largest_Numbers.TwoMaxNumbers(num);
    }
}
/*
 * public static void main(String[] args) { int arr01[] = { 1, 2, 4, 5, 6 };
 * 
 * int arr02[] = { 2, 3, 5, 7 };
 * 
 * int m = arr01.length;
 * 
 * int n = arr02.length;
 * 
 * getIntersection(arr01, arr02, m, n); }
 * 
 * public static void getIntersection(int arr01[], int arr02[], int m, int n) {
 * 
 * int i = 0, j = 0;
 * 
 * while (i < m && j < n) {
 * 
 * if (arr01[i] < arr02[j])
 * 
 * i++;
 * 
 * else if (arr02[j] < arr01[i])
 * 
 * j++;
 * 
 * else { System.out.print(arr02[j++] + " ");
 * 
 * i++;
 * 
 * }
 * 
 * }
 * 
 * } }
 */

/*
 * String[] strArray1 = { "abc1", "def1", "mno1", "xyz1", "pqr1", "xyz1", "def1"
 * };
 * 
 * for (int i = 0; i < strArray1.length-1; i++) {
 * 
 * for (int j = i + 1; j < strArray1.length; j++) {
 * 
 * if ((strArray1[i].equals(strArray1[j])) && (i != j)) {
 * 
 * System.out.println("Duplicates : " + strArray1[j]);
 * 
 * } } }
 */