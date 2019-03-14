package javas;

//autowidening
/*public class WrapperClasses
{
    static void overloadedMethod(Integer I)
    {
        System.out.println("Integer Wrapper Class Type");
    }
    static void overloadedMethod(long l)
    {
        System.out.println("long primitive type");
    }
    public static void main(String[] args)
    {
        int i = 21;
        overloadedMethod(i);
    }
}*/

//autoboxing
public class WrapperClasses
{
	   static void overloadedMethod(Number I)
	    {
	        System.out.println("Number Wrapper Class Type");
	    }
    static void overloadedMethod(Integer I)
    {
        System.out.println("interger Wrapper Class Type");
    }
    static void overloadedMethod(Long L)
    {
        System.out.println("Long Wrapper Class Type");
    }
    public static void main(String[] args)
    {
        double i = 2121.00;
        overloadedMethod(i);
    }
}