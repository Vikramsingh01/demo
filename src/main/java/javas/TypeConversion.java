package javas;

public class TypeConversion {
	
	public static void main(String[] args) {
		byte a = 23;
		byte b = 34;
		byte c = a + b;
		
		short as = 23;
		short bs = 34;
		short cs = as + bs;
		
		int aa = 23;
		int ba = 34;
		int ca = aa + ba;
		
		short[] sArr = {97,43};
		int[] intArr = sArr;
		
		String[] strArr = { "ABC", "XYZ" };
		Object[] objArr = strArr;
	}

}
