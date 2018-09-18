public class SplitExample2{  
public static void main(String args[]){  
	String s1 ="12/07/2014 2:00 PM"; 
	
System.out.println("returning words:");
String date_dd_MM_yyyy[] = (s1.split(" ")[0]).split("/");
String dateTim = s1.split(" ")[1]+" "+s1.split(" ")[2];
System.out.println(date_dd_MM_yyyy[0]);
}  
  
}