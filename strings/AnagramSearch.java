package strings;

public class AnagramSearch {
	
	public static boolean compare(int a[], int b[]) {
		for(int i = 0;i<256;i++) {
			if(a[i] != b[i]) return false;
		}
		return true;
	}
	
	public static void solve(String s, String str) {
		int counts[] = new int[256];
		int countstr[] = new int[256];
		
		// Here we'll use a modified version of Rabin Karp Algorithm which is used for pattern searching 
	// but here we need to do more than pattern searching we have to check permutations
		
		int k = str.length();
		for(int i = 0;i<k;i++) {
			(counts[s.charAt(i)])++;
			(countstr[str.charAt(i)])++;
		}
		
		for(int i = k;i<s.length();i++) {
			if(compare(counts, countstr)) {
				System.out.println("Permutation found at " + (i-k));
			}
			
			counts[s.charAt(i)]++;
			counts[s.charAt(i-k)]--;
			
		}
		
		if(compare(counts, countstr)) {
				System.out.println("Permutation found at " + (s.length()-k));
		}
		
	}
	
	public static void main(String[] args ) {
		// Given a string, check whether the second string is a permutation of first string or not.
		
		String s = "gggacba";
		String str = "abc";
		// time complxiy : O(n*m) by using Sliding Window technique;
		// where m is the size of the second string  and n is the length of the array
		
		solve(s, str);
		
		
	}
}
