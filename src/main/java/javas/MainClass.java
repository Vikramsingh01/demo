package javas;

class A
{
	public A() {
    	System.out.println("AA");
	}
	{
		System.out.println("A");
	}
    static
    {
        System.out.println("THIRD");
    }
}
class B extends A
{
	public B() {
    	System.out.println("BB");
	}
	{
		System.out.println("B");
	}
    static
    {
        System.out.println("SECOND");
    }
}
class C extends B
{
	{
		System.out.println("C");
	}
    static
    {
        System.out.println("FIRST");
    }
    public C() {
    	System.out.println("CC");
	}
}
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}