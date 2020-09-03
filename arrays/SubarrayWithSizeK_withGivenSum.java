package arrays;

public class SubarrayWithSizeK_withGivenSum {
	
	public static boolean solve(int a[], int n, int k, int sum) {
		
		int windowSum = 0;
		for(int i = 0;i<k;i++) {
			windowSum += a[i];
		}
		
		for(int i = k;i<n;i++) {
			if(windowSum == sum) {
				return true;
			}
			
			windowSum -= a[i-k];
			windowSum += a[i];
		}
		
		if(windowSum == sum) return true;
		return false;
		
	}
	
	public static void main(String[] args) {
	    // In this particular program we have to find the subarray of size k with given sum.

	    int a[] = {4, 6, 3, 21, 64, 21};
	    int n = a.length;
	    int k = 2;
	    int sum = 87;
	    
	    if(solve(a, n, k, sum)) System.out.println("Present");
	    else System.out.println("Not Present");

	}

}
