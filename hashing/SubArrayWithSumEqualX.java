package hashing;
import java.util.*;
public class SubArrayWithSumEqualX {

	public static boolean solve(int a[], int n, int x) {
		
		int sum =0;
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0;i<n;i++) {
			sum += a[i];
			if(set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		// Not done.
		int a[] = {5, 3, 8, -2, 8, 10};
		
		int n = a.length;
		
		int x = -2;
		
		if(solve(a, n, x)) System.out.println("yes");
		else System.out.println("no");

	}

}
