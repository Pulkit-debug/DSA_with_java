package strings;

public class StringAnagramOfEachOther {
	public static void main(String[] args) {
		// we have to check if both the strings are anagram of each other or not.
		String s = "tilkup";
		String str = "pkulit";
		
		
		// You can add one more condition to check if the length of both the strings are equal or not
		// if not then simply return -1;
		
		// The time complexity of this will be euqual to O(n) and space comple. = O(1) -> only using 256 i.e const;
		
		// if we use sorting method then the time complexity will be O(nlogn) because sorting algo takes this much time.
		
		int count[] = new int[256];
		boolean flag = true;
		
		
		for(int i = 0;i<s.length();i++) {
			count[s.charAt(i)]++;
		}
		
		for(int i = 0;i<str.length();i++) {
			count[str.charAt(i)]--;
		}
		
		for(int i = 0;i<256;i++) {
			if(count[i] != 0) {
				flag = false;
			}
		}
		
		
		if(flag) System.out.println("Yes");
		else System.out.println("NO");
		
	}
}
