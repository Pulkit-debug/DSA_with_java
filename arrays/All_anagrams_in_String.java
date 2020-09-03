package arrays;

public class All_anagrams_in_String {
	
	public static boolean compare(int a[], int b[]) {
		for(int i = 0;i<a.length;i++) {
		if(a[i] != b[i]) return false;
		}
		return true;
		
	}
	
	public static void  anagram(String s, String str) {
		int counts[] = new int[256];
		int countstr[] = new int[256];
		int window = str.length();
		
		for(int i = 0;i<window;i++) {
			counts[s.charAt(i)]++;
			countstr[str.charAt(i)]++;
		}
		
		for(int i = window;i<s.length();i++) {
			if(compare(counts, countstr)) {
				System.out.println("Found at " + (i-window) + " location");
			}
			
			counts[s.charAt(i)]++;
			counts[s.charAt(i-window)]--;
		}
		
		if(compare(counts, countstr)) {
			System.out.println("Found at " + (s.length()-window) + " location");
		}
		
		
		
		
	}
	public static void main(String[] args) {
		// This is to find the starting index of all anagrams in a string.
		String s = "abcbacccbaabc";
		String str = "abc";
		
		anagram(s, str);
		
	}

}
