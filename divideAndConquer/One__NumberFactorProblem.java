package divideAndConquer;

public class One__NumberFactorProblem {
	
	public static int getWays(int n, int a, int b, int c) {
		
		// Base Condition
		if(n == 0 || n == 1 || n == 2) return 1;
		if(n == 3) return 2; // {1, 1, 1} , {3}
		

		int value1 = getWays(n-a, a, b, c);
		int value2 = getWays(n-b, a, b, c);
		int value3 = getWays(n-c, a, b, c);
		
		return value1 + value2 + value3;
		
	}

	public static void main(String[] args) {
		// Given N , count the number of ways to express N as a sum of 1, 3 and 4
		int n = 5;
		int a = 1;
		int b = 3;
		int c = 4;
		
		
		System.out.println(getWays(n, a, b, c));
		

	}

}
