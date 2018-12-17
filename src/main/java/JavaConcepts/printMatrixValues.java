package JavaConcepts;

public class printMatrixValues {
	public static void printMatrix(int[][] matrix) {
	    for (int row = 0; row < matrix.length; row++) {
	        for (int col = 0; col < matrix[row].length; col++) {
	            System.out.print("   "+ matrix[row][col]);
	        }
	        System.out.println();
	    }
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
			    {10,20,35},
			    {44,50,69},
			    {70,81,96},
			    {10,11,12}
			};
		printMatrix(matrix);
	}
}
