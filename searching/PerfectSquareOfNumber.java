package searching;

public class PerfectSquareOfNumber {

	static boolean power(int n) {
		for(int i = 1;i*i<=n;i++) {
			if((n % i == 0) && (n / i == i))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int n = 15;
		if(power(n)) System.out.println("Yes");
		else System.out.println("No");

	}

}
