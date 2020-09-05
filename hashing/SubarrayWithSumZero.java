package hashing;
import java.util.*;
public class SubarrayWithSumZero {
	
	public static boolean solve(int a[], int n) {
		int sum = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0;i<n;i++) {
			sum += a[i];
			if(set.contains(sum)) return true;
			set.add(sum);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int a[] = {5, 6, 4, -2, 8, 10};
		int n = a.length;

		if(solve(a, n)) System.out.println("Yes");
		else System.out.println("No");
		
	}
}
