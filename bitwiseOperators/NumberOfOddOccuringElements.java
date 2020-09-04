package bitwiseOperators;

public class NumberOfOddOccuringElements {
	
	public static void solve(int a[], int n) {
		
		// just calculate the xor of all the elements
		int res = 0;
		for(int i = 0;i<n;i++) {
			res ^= (1 << a[i]);
		}
		
		System.out.println("Odd occuring elements are: ");
		for(int i = 0;i<n;i++) {
			if((res & (1 << a[i])) == 1) {
				System.out.print(a[i] + " ");
				res ^= (1 << a[i]);
			}
		}
		
		// P.S -> Do this with HashMap also
		
//		System.out.println(res);
		
	}

	public static void main(String[] args) {
		int a[] = {3, 3, 3, 4, 4, 5, 6, 6};
		int n = a.length;
		
		solve(a, n);
	}

}
