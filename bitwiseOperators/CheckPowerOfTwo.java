package bitwiseOperators;

public class CheckPowerOfTwo {
	
	public static boolean solve(int n) {
		if((n & (n-1)) == 0) return true;
		return false;
	}
	
	public static void main(String[] args) {
		int n = 16;
		
		if(solve(n)) System.out.println("Yes");
		else System.out.println("No");
	}
}
