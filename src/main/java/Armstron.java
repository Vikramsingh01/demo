
public class Armstron {
public static void main(String[] args) {
	int num = 151;
	int temp =num;
	int a ,b=0, c;
	while(num>0){
		a = num%10;
	    b = (a*10)+b;
	    num/=10;
	    
	}
	if (num==temp){
		System.out.println("P");
	}else{
		System.out.println("np");
	}
}
}
