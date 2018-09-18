 abstract class A {
	void run() {
		System.out.println("Inside A's m1 method");
	}

	abstract void walk();
	abstract void talk();

}

 abstract class B extends A {

	void walk() {}
	
	abstract void talk();
}


