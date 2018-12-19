package JavaConcepts;
public class ForEachLoop
{
    public static void main(String[] args)
    {
        //Two Dimensional Array
    	int[][] twoDArray = {
			    {10,20,35},
			    {44,50,69},
			    {70,81,96},
			    {10,11,12}
			};
        //iterating every element of twoDArray using for-each loop
        for (int[] oneDArray : twoDArray)
        {
            System.out.print("[");
            //iterating every element of oneDArray using for-each loop
            for (int i : oneDArray)
            {
                System.out.print(i+" ");
            }
            System.out.println("]");
        }
    }
}