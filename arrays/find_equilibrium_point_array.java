package arrays;
import java.util.*;

public class find_equilibrium_point_array {
	

    
    public static int solve(int a[], int n) {
        int sum = 0;
        int lsum = 0;
        for(int i = 0;i<n;i++) {
            sum += a[i];
        }
        
        for(int i = 0;i<n;i++) {
            if(lsum == sum -a[i]) {
                return i;
            }
            
            lsum += a[i];
            sum -= a[i];
        }
        
        return -1;

    }
	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				int t  = sc.nextInt();
				while(t-- != 0) {
				    int n = sc.nextInt();
				    int a[] = new int[n];
				    for(int i = 0;i<n;i++) a[i] = sc.nextInt();
				    
				    int res = solve(a, n);
				    if(res == -1) System.out.println(res);
				    else System.out.println(res+1);
				}
			
		}
	}

