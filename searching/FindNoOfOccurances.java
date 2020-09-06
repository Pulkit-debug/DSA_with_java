package searching;
import java.util.*;
public class FindNoOfOccurances {
	// This solution works best in when the array is not sorted.
	// Although this solution is still pretty good.

	public static void solve(int a[], int n, int x) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0;i<n;i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> newmap : map.entrySet()) {
			if(x == newmap.getKey()) {
				System.out.println(newmap.getValue());
				break;
			}
		}
		
	}
	
	public static int solve2(int a[], int x, int n) {
		
		// Here the approach is to find the left most occurance of the element and then find the right most occurance of the element
		// And then subtracting their index value wll give us the count.
		
		int left = first(a, 0, n-1, x, n);
		
		
		if(left == -1) return -1;
		
		int right = last(a, left, n-1, x, n);
		
		return right-left+1;
		
			
		
	}
	
	  static int first(int arr[], int low, int high, int x, int n) 
	    { 
	      if(low > high) return -1;
	        /*low + (high - low)/2;*/  
	        int mid = (low + high)/2;   
	        if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x) 
	          return mid; 
	        else if(x > arr[mid]) 
	          return first(arr, (mid + 1), high, x, n); 
	        else
	          return first(arr, low, (mid -1), x, n); 
	      
	    } 
	
	  static int last(int arr[], int low, int high, int x, int n) 
	    { 
	      if(low > high) return -1;
	        /*low + (high - low)/2;*/      
	        int mid = (low + high)/2;  
	        if( ( mid == n-1 || x < arr[mid+1]) && arr[mid] == x ) 
	          return mid; 
	        else if(x < arr[mid]) 
	          return last(arr, low, (mid -1), x, n); 
	        else
	          return last(arr, (mid + 1), high, x, n);       
	      
	    } 
	       
	
	public static void main(String[] args) {
		// Given an sorted array with repitiion, find the no. of occrance of a given element
	    int a[] = {2, 3, 3, 5, 5, 6, 6, 5, 2};
	    int x = 5;
	    int n = a.length;
	    
//	    solve(a, n, x);
	    
	    System.out.println(solve2(a, x, n));
	    
	}

}
