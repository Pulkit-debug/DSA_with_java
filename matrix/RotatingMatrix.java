package matrix;

public class RotatingMatrix {
	
	
	
	public static void rotate(int a[][], int row, int col) {
		// just do the transpose of the matrix and change the rows or columns
		
	}

	public static void main(String[] args) {
		// Rotate the matrxi by 90 degre clock wise
	    int a[][] = {
	        {1, 2, 3},
	        {4, 5, 6},
	        {7, 8, 9}
	    };
	    
	    int row = a.length;
	    int col = a[0].length;
	    
	    rotate(a, row, col);

	}

}
