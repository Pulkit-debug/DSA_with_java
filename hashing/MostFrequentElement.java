package hashing;
import java.util.*;
public class MostFrequentElement {

	public static void solve(int a[], int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0;i<n;i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
			
		}
		int max = 0;
		int key = 0;
		
//		for(Map.Entry<Integer, Integer> check : map.entrySet()) {
//			System.out.println(check.getKey() + " " + check.getValue());
//		}
//		
		for(Map.Entry<Integer, Integer> newmap : map.entrySet()) {
			if(newmap.getValue() > max) {
				max = newmap.getValue();
				key = newmap.getKey();
			}
		}
		
		// one more way to iterate
//		map.forEach((k, v) -> {
//			System.out.println(k + " " + v);
//		});1
		System.out.println(key);
		
	}
	
	public static void main(String[] args) {
		 int a[] = {1, 3, 2, 1, 4, 1};
		 
		 int n = a.length;
		 solve(a, n);

	}

}
