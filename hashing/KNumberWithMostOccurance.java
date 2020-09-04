package hashing;
import java.util.*;
public class KNumberWithMostOccurance {
	
	
	public static void solve(int a[], int n, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0;i<n;i++) {
			// This will populate the map with key and occurances
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}
		
		// creeate a list from the elements of the hashmap
		ArrayList<Map.Entry<Integer, Integer>> al = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
		
		
		// sort the list
		Collections.sort(al, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
				if(m1.getValue() == m2.getValue()) return m2.getKey() - m1.getKey();
				return m2.getValue() - m1.getValue();
			}
		});
		
		for(int i = 0;i<k;i++) {
			System.out.println(al.get(i).getKey());
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		int a[] = {3, 1, 4, 4, 4, 5, 2, 6, 1};
		int n = a.length;
		
		int k = 2;
		solve(a, n, k);
		
	}
}
