import java.util.*;
public class Test {

	public static int count = 0;
	public static void main(String[] args) {
	
			String s = "1 3 5";
			ArrayList<String> al = new ArrayList<>(Arrays.asList(s.split(" ")));
			ArrayList<Integer> check = new ArrayList<Integer>();
			for(String a : al) {
				check.add(Integer.parseInt(a));
			}
//			System.out.println();
			
			System.out.println(s);
			
	}
}

