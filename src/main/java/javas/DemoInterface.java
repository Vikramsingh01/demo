package javas;


public interface DemoInterface {

	public void displayName(String name);
	public default void method(){
		
		System.out.println("This is defaul one!!");
	}
	public static void display(){
	
		System.out.println("display");
	}
	public static void show(){
		
		System.out.println("show");
	}
	public void secondMethod();
}
