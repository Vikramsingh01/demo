package javas;

public abstract class DemoAbstractclass {
	void sunday() {
		System.out.println("sunday");
	}

	 
	  void monday() { System.out.println("monday"); }
	  
	 abstract void tuesday();
	 
}


class dbcchild extends DemoAbstractclass {

	@Override
	void tuesday() {
		System.out.println("dbcachield tuesday");
		
	}

}