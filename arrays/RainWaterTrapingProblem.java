package arrays;

public class RainWaterTrapingProblem {
	
	public static int solve(int a[], int n) {
		int leftMax[] = new int[n];
		int rightMax[] = new int[n];
		leftMax[0] = a[0];
		for(int i = 1;i<n;i++) {
			leftMax[i] = Math.max(a[i-1], a[i]);
		}
		
		rightMax[n-1] = a[n-1];
		for(int i = n-2;i>=0;i--) {
			rightMax[i] = Math.max(a[i+1], a[i]);
		}
		
		int water = 0;
		for(int i = 0;i<n;i++) {
			water += Math.min(leftMax[i], rightMax[i]) - a[i];
		}
		
		return water;
		
	}
	
	public static void  main(String[] args) {
	    int a[] = {3, 0, 6, 4, 5};
	    int n = a.length;
	    
	    System.out.println(solve(a, n));
	}
}
