
/*public class Palindro {
public static void main(String[] args) {
	int num = 151;
	int temp = 0;
	int a ,b=0, c;
	while(num>0){
		a = num%10;
	    b = (a*10)+b;
	    num/=10;
	    
	}
	
	if (num==b){
		System.out.println("P");
	}else{
		System.out.println("np");
	}
}
}
*/
class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  