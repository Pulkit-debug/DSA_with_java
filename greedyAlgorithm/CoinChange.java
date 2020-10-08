package greedyAlgorithm;
import java.util.*;
public class CoinChange {
static void coinChangeProblem(int [] coins, int N) {
	    
		Arrays.sort(coins);//Sort the coins in ascending order
		int index = coins.length-1;
		while(true){
			if(index >= 0) {
		   	int coinValue = coins[index];
		   	index--;
			int maxAmount = (N/coinValue)*coinValue;
			if(maxAmount>0) {
	    	  System.out.println("Coin value: "+coinValue+ " taken count: "+(N/coinValue));
	    	   N = N - maxAmount;
			}
			}
			
	        if(N==0)break;
		}//end of while loop
	}//end of method

	public static void main(String[] args) {
		int [] coins = {186, 419, 83, 408};
		int amount = 6249;
		System.out.println("Coins available: "+Arrays.toString(coins));
		System.out.println("Target amount: "+ amount);
		coinChangeProblem(coins, amount);
	}

}
