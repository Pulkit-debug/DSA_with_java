package hashing;
import java.util.*;
public class CountAllDistinctElements {
	
	public static void solve(int a[], int n) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 0;i<n;i++) {
			hs.add(a[i]);
		}
		
		System.out.println(hs);
		
	}
	
	public static void solve2(int a[], int n) {
		// Another variety of this question can be that remove the only take the elemnts that are present once in the array
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 0;i<n;i++) {
			if(hs.contains(a[i])) hs.remove(a[i]);
			else
			hs.add(a[i]);
		}
		
		System.out.println(hs);
		
	}

	public static void main(String[] args) {
		// In this we have to count all the distinct elements present in the array
		int a[] = {1, 5, 2, 3, 1, 2};
		
		int n = a.length;
		
		solve(a, n);
		solve2(a, n);


	}

}
