package bitwiseOperators;

public class CheckKthBitSetOrNot {
	public static void main(String[] args) {
		int n = 5	;
		int k = 1;
		
		if((n & (1 << (k-1))) == 1) System.out.println("yes");
		else System.out.println("no");
	}
}
