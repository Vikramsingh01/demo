package javas;



class Animal {
    public static void foo() {
        System.out.println("Animal");
    }
    void display(){
    	System.out.println("Animal Class#####");
    }
}

 class Cat extends Animal {
    public static void foo() {  // hides Animal.foo()
        System.out.println("Cat");
    }
    void display(){
    	System.out.println("Cat Class#####");
    	super.display();
    }
}

public class MainClass{
	public static void main(String[] args) {
		 
		Animal a =new Cat();
		a.display();
		a.foo();
		
		
	}
	
}