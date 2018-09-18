import java.text.SimpleDateFormat;
import java.util.Date;

public class CodingExamples
{
    public static void main(String args[])
    {
    	 Date date = new Date();
    	 
         SimpleDateFormat formatter = new SimpleDateFormat("dd yyyy MMM");
  
         System.out.println(formatter.format(date));
    }
}