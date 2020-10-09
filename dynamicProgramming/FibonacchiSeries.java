package dynamicProgramming;

public class FibonacchiSeries {
	
	static int fib(int n) {
		if(n == 0) return 0;
		else if(n == 2) return 1;
		
		int dp[] = new int[n+2];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2;i<=n;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
	
	static int fib2(int dp[], int n) {
		// using recursion
		if(n == 0) return 0;
		else if(n == 2) return 1;
		
		dp[0] = 0;
		dp[1] = 1;
		
		if(dp[n] == 0) {	// if we have not solved this problem earlier then only solve it.
			dp[n] = fib2(dp, n-1) + fib2(dp, n-2);
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		int n = 9;
		// printing nth fibonacchi number
		int dp[] = new int[n+2];
		System.out.println(fib(n));
		System.out.println(fib2(dp, n));
		
		
		
		
	}
}
