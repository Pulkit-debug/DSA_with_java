package strings;

public class StringsRotationOfEachOther {
	
	public static void solve(String s, String str ) {
		// Just a simple trick we use here
		// append the main string with itself and do find if the second contains in it or not.
		s = s + s;
		if(s.contains(str)) {
			System.out.println("Yes");
		}
		else
		System.out.println("No");
	}
	
	public static void main(String[] args) {
		// check if the second string is rotation of first string or not.
		String s = "abd";
		String str = "cdab";
		
		solve(s, str);
	}
}
