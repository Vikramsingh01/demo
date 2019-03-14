package javas;
class InnerOuterClassTest
{
    private int i;
    private void methodOfClassA()
    {
        //Private Method
        System.out.println(i);  //Private field can be used within class
        //B b = new B();          //Private inner class can be used within class
    }
     private class B
    {
      private void methodB() {
		System.out.println("inside Private inner class B methodB");

	}
    }
    public static void main(String[] args) {
		InnerOuterClassTest a = new InnerOuterClassTest();
		B b = a.new B(); 
		//a.methodOfClassA();
		//A.B b =a.new B();
				b.methodB();
	}
} 