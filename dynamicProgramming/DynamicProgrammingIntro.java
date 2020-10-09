package dynamicProgramming;

public class DynamicProgrammingIntro {
	
	// *********** WHAT IS DYNAMIC PROGRAMMING...
		// Dynamic programming is a method for solving a complex problem by breaking down it into a collections of simpler subproblems
	// solving each of those subproblems just once, and storing their solutions.
	
	
	// The next time the same subproblem occurs, isntead of recomputing it's solution, one simply looks up the previously computed solution
	// thereby saving computation time at the expense of a modest expenditure in storage space.
	
	// Dynamic Programming is mainly an Optimization over plain 'Divide and Conquer'
	
	
	
	// ********************WHY SHOULD WE LEARN 'DYNAMIC PROGRAMMING'
	
	// 1. Optimal SubStructure
		// Any problem has optimal substructure property if it's overall optmial solution can be constructed from the optimal solution of it's subproblem
		
		// Example: Fib(n) = Fib(n-1) + Fib(n-2)
	
		// Divide&Conquer also has this property
	
	
	// 2. Overlapping Subproblem
		// Any problem has overlapping sub-problem if finding its solution involves solving the same sub-problem multiple times.
	
		// This property makes Dynamic Programming differ from Divide and Conquer
	
		// Example: Fib(6) called Fib(4) twice and Fib(3) thrice
	
	
	
	
	// ******** There are two approaches in Dynamic Programming
				// 1. Top Down Approach
			
				// 2. Bottom Up Approach
			
			// Now both the top down and bottom up are opposite to each other in top down we start from big to small
			// and for bottom up we go from small to big.
			
	
	
	// ******* Comparison of Bottom Up and Top Down Approach
	
	
/*Comparison On						Top Down									Bottom Up
 * 
 * Ease of Algorithm		Easy to come up with an solution as			Not Easy to come up with a solution
 * 							it is an extension of D & Conquer
 * 
 * Run time of Algorithm	Slow											Fast
 * 
 * Space Efficiency			Unnecessary use of extra stack space.			No Stack is used.
 * 							Can run out of stack space if computation
 * 							is huge
 * 
 * 
 * When to use?				need a quick solution.							Need a efficient solution.
 * 
 * */
			

}
