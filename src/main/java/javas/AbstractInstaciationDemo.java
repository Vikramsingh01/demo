package javas;

public class AbstractInstaciationDemo {

	public static void main(String[] args) {
		//DemoAbstractclass dac =new DemoAbstractclass() {};
				
			//dac.sunday();	
			dbcchild dbca = new dbcchild();
			dbca.sunday();
			dbca.tuesday();
		
		DemoInterface dif = new DemoInterface() {
			
			@Override
			public void displayName(String name) {
				
				System.out.println(name);
			}

			@Override
			public void secondMethod() {
				
				System.out.println("second!!!");
				
			}
		};
		dif.displayName("Vikram Bana!!!");
		DemoInterface.show();
		dif.method();
		dif.secondMethod();
	}

}
