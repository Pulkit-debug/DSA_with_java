package divideAndConquer;

public class HouseTheifProblem {
		
		  public static int workingSolutionForBigTestCases(int a[], int n) {
		        if(n == 0) return 0;
		        int value1 = a[0];
		        if(n == 1) {
		            return a[0];
		        }
		        int value2 = Math.max(a[0], a[1]);
		        if(n == 2) {
		            return Math.max(a[0], a[1]);
		        }
		        
		        int max = 0;
		        
		        for(int i = 2;i<n;i++) {
		            max = Math.max(value1 + a[i], value2);
		            value1 = value2;
		            value2 = max;
		        }
		        return max;
		        
		    }
		    
		  
	 public static int money(int a[] ,int currentIndex) {
	        
	        // Base Case
	        if(currentIndex >= a.length) return 0;
	        
	        int stealFromFirst = a[currentIndex] + money(a, currentIndex + 2);
	        int stealFromSecond = money(a, currentIndex+1);
	        return Math.max(stealFromFirst, stealFromSecond);
	        
	    }
	 
	public static void main(String[] args) {
		// Question: 
				// There are n houses build in a line each of which contains some value in it.
				// A thief is going to steal the maximal value of these houses.
				// but he can't steal in two adjacent houses
				// What is the maximum stolen value?
		
		// example: 
			// input: {6, 7, 1, 30, 8, 2, 4}
			// output: 41
			// Theif will steal: House 7 30 4
		
		int a[] = {6, 7, 1, 30, 8, 2, 4};
			
		System.out.println(money(a, 0));
		System.out.println(workingSolutionForBigTestCases(a, a.length));
		

	}

}
