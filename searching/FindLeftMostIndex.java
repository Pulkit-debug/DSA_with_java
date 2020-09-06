package searching;

public class FindLeftMostIndex {
	
	public static int search(int a[], int low, int high, int x) {
		if(low > high) return -1;
		int n = high;
		int mid = (low + high) / 2;
		if(a[mid] == x && (mid == 0 || a[mid-1] != x)) {
			return mid;
		}
		else if(a[mid] >= x) return search(a, low, mid-1, x);
		return search(a, mid+1, high, x);
		
		
	}
	
	public static void main(String[] args) {
	    // Given an sorted array with repitiion, find left most index of a given element.
	    int a[] = {2, 3, 3, 3, 3};
	    int x = 2;
	    int low = 0;
	    int high = a.length - 1;
	    System.out.println(search(a, low, high, x));
	}
}
