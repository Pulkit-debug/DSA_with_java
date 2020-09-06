package searching;

public class BinarySearch {
	
	public static int binarySearch(int a[], int low, int high, int x) {
		if(low > high) return -1;
		
		int mid = (low + high) / 2;
		
		if(a[mid] == x) return mid;
		else if(a[mid] > x) return binarySearch(a, low, mid-1, x);
		return binarySearch(a, mid+1, high, x);
	}
	
	public static void main(String[] args) {
	    int a[] = {1, 10, 20, 30, 40, 50, 60, 70};
	    int x = 5;
	    int n = a.length;
	    int low = 0;
	    int high = n - 1;
	    
	    System.out.println(binarySearch(a, low, high, x));
	    
	}
}
