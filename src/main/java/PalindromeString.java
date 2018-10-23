
public class PalindromeString {
public static void main(String[] args) {
	String input = "mam";
	String r="";
	for (int i = input.length()-1;i>=0;i--){
		 r+=input.charAt(i);
	}

if(input.equals(r)){
	System.out.println("pahlindrome string");
}else{
	System.out.println("not palindrome");
}
}
}
