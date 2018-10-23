import java.util.Scanner;

class ReverseString
{
   public static void main(String args[])
   {
      String original ="Hellobhai";
      String reverse = "";
     
      
     
      for (int i = original.length() - 1 ; i >= 0 ; i--)
         reverse = reverse + original.charAt(i);
         
      System.out.println("Reverse of the string: " +reverse);
   }
}