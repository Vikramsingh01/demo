
class PrimeNumbers
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";
      /* Scanner scan= new Scanner(System.in);
   	System.out.println("Enter any number:");
   	//capture the input in an integer
   	int num=scan.nextInt();
           scan.close();*/
       
       for (i = 1; i <= 10; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }
}