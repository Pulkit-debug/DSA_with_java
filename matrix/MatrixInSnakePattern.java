package matrix;

public class MatrixInSnakePattern {
	public static void main(String[] args) {
		int a[][] = {
		        {1, 2, 3},
		        {4, 5, 6},
		        {7, 8, 9}
		    };
		
		int row = a.length;
		int col = a[0].length;
		
		for(int i = 0;i<row;i++) {
			if(i % 2 == 0) {
				for(int j = 0;j<col;j++) {
					System.out.print(a[i][j] + " ");
				}
			}
			else {
				for(int j = col-1;j>=0;j--) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}
		
	}
}
