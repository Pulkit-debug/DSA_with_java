package hashing;
import java.util.*;
public class PairSumEqualToX {

	public static boolean solve(int a[], int n, int x) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum = x - a[i];
			if(set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		// find a pair with sum equal to x
		int a[] = {3, 5, 2, 8, 10, 7};
		
		int n = a.length;
		int x = 17;
		
		if(solve(a, n, x)) System.out.println("yes");
		else System.out.println("no");


	}

}
