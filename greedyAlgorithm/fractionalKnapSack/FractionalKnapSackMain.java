package greedyAlgorithm.fractionalKnapSack;
import java.util.*;
public class FractionalKnapSackMain {

	public static void main(String[] args) {
		// Create Array of Objects
		ArrayList<FractionalKnapsackItem>items = new ArrayList<>();
		int [] value = {60, 100};
		int [] weight = {10, 20};
		int capacity =50;
		
		//Add the user input data in Knapsack
		for(int i = 0; i<value.length;i++) {
			items.add(new FractionalKnapsackItem(i+1, value[i], weight[i]));
		}
				
		//Send the data for further processing
		FractionalKnapsack.knapSack(items, capacity);

	}

}
