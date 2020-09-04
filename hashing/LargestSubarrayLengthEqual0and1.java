package hashing;
import java.util.*;
public class LargestSubarrayLengthEqual0and1 {

	public static void solve(int a[], int n) {
		
		for(int i = 0;i<n;i++) {
			if(a[i] == 0) {
				a[i] = -1;
			}
		}
		
		int sum = 0;
		int maxLen = 0;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0;i<n;i++) {
			if(a[i] == -1) sum += -1;
			else sum += 1;
			
			if(map.containsKey(sum)) {
				maxLen = Math.max(maxLen, i-map.get(sum));
			}
			else {
				map.put(sum, i);
			}
			
		}
		
		System.out.println(maxLen);
	}
	
	public static void main(String[] args) {
		// // Given an binary Array we have to find the length largest subarray that contains equal no. of 0's and 1's 

		int a[] = {1, 0, 0, 1, 1, 0};
		int n = a.length;
		
		solve(a, n);

	}

}
