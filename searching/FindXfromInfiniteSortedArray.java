package searching;

public class FindXfromInfiniteSortedArray {
	
	static int binarySearch(int a[], int low, int high, int x) {
		int mid = low + (high - low) / 2;
		if(a[mid] == x) return mid;
		
		if(low > high) return  -1;
		if(a[mid] > x) return binarySearch(a, low, mid-1, x);
		else return binarySearch(a, mid+1, high, x);
	}
	
	static int solve(int a[], int n, int x) {
		// If the array is infinite so we don't have high
		
		if(a[0] == x) {
			return 0;
		}
		int i = 1;
		
		while(a[i] < x) {
			i = i * 2;
		}
		
		if(a[i] == x) return i;
		else return binarySearch(a, i/2, i, x);
		
	}
	
	public static void main(String[] args) {
	
    // given an infinite sorted array and an element x we need to find if x is present in the array or not.

    int a[] = {1, 8, 20, 40, 80, 90, 100, 120, 140};
    int x = 80;
    int n = a.length;
    
    System.out.println(solve(a, n, x));
    
	}

}
