package greedyAlgorithm;


// ***************** QUESTION

// *************ALSO KNOWN AS ACTIVITY SELETION PROBLEM


/*
 
There is one meeting room in a firm. There are N meetings in the form of (S[i], F[i]) where S[i] is start time of meeting i and F[i] is finish time of meeting i.

What is the maximum number of meetings that can be accommodated in the meeting room?

Input:
The first line of input consists number of the test cases. The description of T test cases is as follows:
The first line consists of the size of the array, second line has the array containing the starting time of all the meetings each separated by a space, i.e., S [ i ]. And the third line has the array containing the finishing time of all the meetings each separated by a space, i.e., F [ i ].

Output:
In each separate line print the order in which the meetings take place separated by a space.

Constraints:
	// They were giving so I removed them.
	 * 
	 * 
Example:
Input:
2
6
1 3 0 5 8 5
2 4 6 7 9 9
8
75250 50074 43659 8931 11273 27545 50879 77924
112960 114515 81825 93424 54316 35533 73383 160252  

Output:
1 2 4 5
6 7 1

Explanation:
Testcase 1: Four meetings can held with given start and end timings.


*/

 import java.util.*;
public class N_Meetings_In_A_Room__GFG {
	
	static class Room {
		int start;
		int finish;
		int index;
		
		Room(int start, int finish, int index) {
			this.start = start;
			this.finish = finish;
			this.index = index;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			int start[] = new int[n];
			int finish[] = new int[n];
			

			for(int i = 0;i<n;i++) {
				start[i] = sc.nextInt();
			}
			
			for(int i = 0;i<n;i++) {
				finish[i] = sc.nextInt();
			}
			
//			Room meeting[] = new Room[n];
			ArrayList<Room> meeting = new ArrayList<>();
			
			for(int i = 0;i<n;i++) {
				meeting.add(new Room(start[i], finish[i], i+1));
			}
			
			Collections.sort(meeting, new Comparator<Room>() {
				@Override
				public int compare(Room r1, Room r2) {
					return r1.finish - r2.finish;
				}
			});
			
			
			
			sb.append(meeting.get(0).index + " ");
			
			
			int j = 0;
			for(int i = 1;i<n;i++) {
				if(meeting.get(i).start >= meeting.get(j).finish) {
					sb.append(meeting.get(i).index + " ");
					j = i;
				}
			}
			
			sb.append("\n");
			
			
		}
		System.out.println(sb);

	}

}
