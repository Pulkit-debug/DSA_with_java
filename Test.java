import java.util.*;
public class Test {
	
	public static int mapKaKhel(int a[], int n) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i = 0;i<n;i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}
//		System.out.println(map);
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			
			if(entry.getValue() % 2 == 0) {
				Set<Integer> keys = map.keySet();
				List<Integer> al = new ArrayList<Integer>(keys);
				return al.indexOf(entry.getKey());
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0;i<n;i++) a[i] = sc.nextInt();
			
			int index = mapKaKhel(a, n);
			
			HashSet<Integer> set1 = new HashSet<Integer>();
//			for(int x : a) {
//				set1.add(x);
//			}
			
			HashSet<Integer> set2 = new HashSet<Integer>();
			HashSet<Integer> fullSet = new HashSet<Integer>();
//			for(int x : a) {
//				set2.add
//			}
			
//			
			
			
			if(index == -1) {
//				System.out.println("coming");
				for(int i = 0;i<n;i++) fullSet.add(a[i]);
			}
			
			else if(index == 0) {
//				firstHalf.add(a[0]);
				set1.add(a[0]);
				for(int i = index+1;i<n;i++) {
//					secondHalf.add(a[i]);
					set2.add(a[i]);
				}
			}
			
			
			else if(index != 0 && index != n-1){
				for(int i = 0;i<index;i++) {	
//					firstHalf.add(a[i]);
					set1.add(a[i]);
				}
			for(int i = index+1;i<n;i++) {
//				secondHalf.add(a[i]);
				set2.add(a[i]);
			}
			}
			
			else if(index == n-2) {
//				secondHalf.add(a[n-1]);
				set2.add(a[n-1]);
				for(int i = 0;i<index;i++) {	
//					firstHalf.add(a[i]);
					set1.add(a[i]);
				}
			}
			
			int maxA = 0;
			int maxB = 0;
//			List<Integer> s1 = new ArrayList<Integer>(set1);
//			List<Integer> s2 = new ArrayList<Integer>(set2);
//			List<Integer> sfull = new ArrayList<Integer>(fullSet);
//			Collections.sort(s1);
//			Collections.sort(s2);
//			Collection.sort(sfull);
			
			if(!set1.isEmpty()) {
			for(int i = 0;i<set1.size()+1;i++) {
				if(!set1.contains(i)) {
					maxA = i;
					break;
				}
			}
			}
			
			if(!set2.isEmpty()) {
			for(int i = 0;i<set2.size()+1;i++) {	
				if(!set2.contains(i)) {
					maxB = i;
					break;
				}
			}
			}

			if(!fullSet.isEmpty()) {
			for(int i = 0;i<fullSet.size()+1;i++) {
				if(!fullSet.contains(i)) {
					maxA = i;
					break;
				}
			}
			}
			if(set1.size() >= 1 && maxA == 0) {
				maxA = 1;
			}
			if(set2.size() >= 1 && maxB == 0) maxB = 1;
			
			
			System.out.println(maxA + maxB);
			
			
		}
	}
	
	
	
}

