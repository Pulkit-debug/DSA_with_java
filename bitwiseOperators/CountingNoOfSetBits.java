package bitwiseOperators;

public class CountingNoOfSetBits {
	
	public static void solve(int n) {
		int count =0;
		while(n > 0) {
			n = (n & (n-1));
			count++;
		}
		
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		// We have to count no. of set bits
		int n = 5;
		
		solve(n);
	}
}
