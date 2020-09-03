package arrays;

import java.util.*;

public class StockBuyAndSell {
	
	public static void solve(int a[], int n) {
		
		ArrayList<Integer> buy = new ArrayList<Integer>();
		ArrayList<Integer> sell = new ArrayList<Integer>();
		boolean bought = false;
		
		for(int i = 0;i<n;i++) {
			if(i == 0) {
				if(a[i] < a[i+1]) {
					buy.add(i);
					bought = true;
				}
				continue;
			}
			
			if(i == n-1) {
				if(a[i] > a[i-1]) {
					sell.add(i);
					bought = false;
				}
				continue;
			}
			
			if(bought == true) {
				if(a[i] > a[i+1] && a[i] > a[i-1]) {
					sell.add(i);
					bought = false;
				}
				continue;
			}
			
			if(a[i] < a[i+1] && a[i] < a[i-1]) {
				bought = true;
				buy.add(i);
				continue;
			}	
			
		}
		
		for(int i = 0;i<buy.size();i++) {
			System.out.println("Bought at " + buy.get(i) + " and sold at " + sell.get(i));
			
		}
		
		// using iterator to print arraylist
//		Iterator it = buy.iterator();
//		for(int i = 0;i<buy.size();i++) {
//			if(it.hasNext()) {
//				System.out.println(sell.get(i));
//			}
//		}
		
	}
	
	public static void main(String[] args) {
// This questiuon is about to buy and sell stocks. Buy the sell when the price is low and sell the stock when the price is high to make the profit.
	
	int a[] = {23, 13, 25, 29, 33, 19, 34, 45, 65, 67};
	int n =  a.length;
	
	solve(a, n);

	}
}
