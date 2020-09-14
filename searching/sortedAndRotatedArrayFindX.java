package searching;

public class sortedAndRotatedArrayFindX {

	public static int binarySearch(int a[], int low, int high, int x) {
		int mid = (low + high) / 2;
		if(low > high) return -1;
		if(a[mid] == x) return mid;
		
		
		if(a[mid] > x) {
			return binarySearch(a, low, mid-1, x);
		}
		return binarySearch(a, mid+1, high, x) ;
	}
	
	public static int findPivot(int a[], int low, int high, int n, int x) {
		// In this function we basically only find the pivot i.e where the array is rotated
		int mid = (low + high) / 2;
		if(a[mid] == x) {
			return mid;
		}
		if(low > high) return -1;
		if(low == high) return low;
		
		if(a[mid] > a[mid+1] && mid < high) {
			return mid;
		}
		
		if(a[mid] < a[mid-1] && mid > low) {
			return mid -1;
		}
		
		if(a[mid] <= a[low]) {
			return findPivot(a, low, mid-1, n, x);
		}
		return findPivot(a, low, mid+1, n, x);
	}
	
	public static int solve(int a[], int low, int high, int n, int x) {
		int pivot = findPivot(a, low, high, n, x);
		if(pivot == -1) {
			return binarySearch(a, low, high, x);
		}
		
		if(a[pivot] == x) {
			return pivot;
		}
		
		if(a[0] < x) {
			return binarySearch(a, low, pivot, x);
		}
		
		return binarySearch(a, pivot+1, high, x);
		
		
	}
	
	public static void main(String[] args) {
	    // Given a sorted and rotated array of distinct elements, and an element x, find if x is present in the array or not.

	    int a[] = {10, 20, 40, 5, 6, 7, 8};
	    
	    int n = a.length;
	    
	    int low = 0;
	    int high = n-1;
	    int x = 20;
	    System.out.println(solve(a, low, high, n, x));
		
	}

}
