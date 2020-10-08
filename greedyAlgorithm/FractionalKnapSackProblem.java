package greedyAlgorithm;
import java.util.*;

class FractionalKnapsackItem {
	private int index;
	private int value;
	private int weight;
	private double ratio;

	//constructor
	public FractionalKnapsackItem(int index, int value, int weight) {
		this.index = index;
		this.value = value;
		this.weight = weight;
		ratio = value * 1.0 / weight;
	}//end of method
	

	public int getIndex() {
		return index;
	}//end of method

	
	public void setIndex(int index) {
		this.index = index;
	}//end of method
	

	public int getValue() {
		return value;
	}//end of method
	

	public void setValue(int value) {
		this.value = value;
	}//end of method
	

	public int getWeight() {
		return weight;
	}//end of method
	

	public void setWeight(int weight) {
		this.weight = weight;
	}//end of method
	

	public double getRatio() {
		return ratio;
	}//end of method

	
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}//end of method

	
	@Override
	public String toString() {
		return "Item index=" + index + ", value=" + value + ", weight=" + weight + ", ratio=" + ratio + "]";
	}//end of method
}


class FractionalKnapsack {
	
	static void knapSack(ArrayList<FractionalKnapsackItem> items, int capacity) {
		// Sort items by descending ratio of value/ weight
		//Implement Comparator interface and specify which variable('Ratio') of user defined class should the 'compare' method work on.
		//This needs to be done because this will be required in Sort method  
		Comparator<FractionalKnapsackItem> comparator = new Comparator<FractionalKnapsackItem>() {
			@Override
			public int compare(FractionalKnapsackItem o1, FractionalKnapsackItem o2) {
				if(o2.getRatio()>o1.getRatio())return 1;
				else return -1;
			}
		};
		
		
		//Sort all the objects stored in the Arraylist by 'Ratio' variable
		Collections.sort(items, comparator);
		
		
		//Run greedy algo
		int usedCapacity = 0;
		double totalValue = 0;
		for (FractionalKnapsackItem item : items) {
			//if full consumption possible then consume it
			if(usedCapacity+ item.getWeight()<=capacity) {
				usedCapacity+=item.getWeight();
				// System.out.println("Taken: "+item);
				totalValue+=item.getValue();
			}
			else {
				//else consume fractionally
				int usedWeight = capacity - usedCapacity;
				double value = item.getRatio()*usedWeight;
				// System.out.println("Taken: "+"item index = " + item.getIndex() + ",obtained value = " + value + ",used weight = " + usedWeight + ", ratio = " + item.getRatio()
				// 		+ "]");
				usedCapacity+=usedWeight;
				totalValue+=value;
			}
			//if capacity is full then break
			if(usedCapacity==capacity)break;
		}
		//print finally obtained value
		System.out.println(Math.round(totalValue*100.0)/100.0);
	}
}



public class FractionalKnapSackProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    int n = sc.nextInt();
		    int capacity = sc.nextInt();
		    ArrayList<Integer> full = new ArrayList<Integer>();
		    ArrayList<FractionalKnapsackItem>items = new ArrayList<>();
		    for(int i = 0;i<2*n;i++) {
		        full.add(sc.nextInt());
		    }
		    ArrayList<Integer> value = new ArrayList<Integer>();
		    ArrayList<Integer> weight = new ArrayList<Integer>();
		    
		    
		    
		    for(int i = 0;i<2*n;i++) {
		        if(i % 2 == 0) {
		            value.add(full.get(i));
		        }
		        else {
		            weight.add(full.get(i));
		        }
		    }
		    
		  //  System.out.println(value);
		  //  System.out.println(weight);
		    
		    //Add the user input data in Knapsack
		for(int i = 0; i<value.size();i++) {
			items.add(new FractionalKnapsackItem(i+1, value.get(i), weight.get(i)));
		}
				
		//Send the data for further processing
		FractionalKnapsack.knapSack(items, capacity);

		    
		  //  // trying getting the density and then sorting it in decreasing order taking one by one from top might give result.
		  //  ArrayList<Integer> density = new ArrayList<Integer>();
		    
		  //  // to find the desnity we can divided value by weight;
		  //  for(int i = 0;i<n;i++) {
		  //      density.add(value.get(i) / weight.get(i));
		  //  }
		    
		  //  System.out.println(density);
		  
		  //for(int i = 0;i<n;i++) {
		      
		  //}
		    
		}	    
	}

}
