package javas;

public class ExceptionHandling {
	public static void main(String[] args) {
		String[] s = { "123" }; // String array containing one null object
		for (int i = 0; i < 6; i++) {
			try {
				int x = 0X677;
				int a = s[i].length() + Integer.parseInt(s[i]);
				// This statement may throw NumberFormatException,
				// NullPointerException and ArrayIndexOutOfBoundsException
			} catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException ex) {
				if (ex.getClass() == NumberFormatException.class)
					System.out.println("NumberFormatException will be caught here");
				if (ex.getClass() == ArrayIndexOutOfBoundsException.class)
					System.out.println("ArrayIndexOutOfBoundsException will be caught here");
				if (ex.getClass() == NullPointerException.class)
					System.out.println("NullPointerException will be caught here");
			}
			System.out.println("After executing respective catch block, this statement will be executed");
		}
	}
}