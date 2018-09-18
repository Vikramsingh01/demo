 

public class TestStringFormatter {  
public static void main(String[] args) {  
    System.out.println(reverseWord("my name is khan"));  
    System.out.println(reverseWord("I am sonoo jaiswal"));  
    }  
public static String reverseWord(String str){  
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuffer sb=new StringBuffer(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  

}  