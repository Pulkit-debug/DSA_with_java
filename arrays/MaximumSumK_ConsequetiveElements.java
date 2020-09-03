package arrays;

public class MaximumSumK_ConsequetiveElements {
	
	public static int solve(int a[], int k) {
		int cursum = 0;
		int maxsum = 0;
		
		for(int i = 0;i<k;i++) cursum += a[i];
		
		for(int i = k;i<a.length;i++) {
			if(cursum > maxsum) {
				maxsum = cursum;
			}
			
			cursum += a[i];
			cursum -= a[i-k];
			
			
		}
		if(cursum > maxsum) maxsum = cursum;
		return maxsum;
		
	}
	
	public static void main(String[] args) {
		
	    int a[] = {100, 200, 300, 400};
	    int k = 2;
	    
	    System.out.println(solve(a, k));
		
	}
}
