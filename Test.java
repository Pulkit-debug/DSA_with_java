import java.util.*;
public class Test {
  
	 
		public static void main (String[] args) throws java.lang.Exception
		{
			Scanner sc = new Scanner(System.in);
			long t = sc.nextLong();
			while(t-- != 0) {
			   long a = sc.nextLong();
			   long b = sc.nextLong();
			   long x = sc.nextLong();
			   long y = sc.nextLong();
			   long n = sc.nextLong();
			   long d[] = new long[2];
			   
			   long temp  = 0;
		        long count = 0;
		        
		        if(a == b) {
		            temp = Math.min(x, y);
		            if(temp == x) {
		                while(a > x && a > 2) {
		                    a--;
		                    n--;
//		                    System.out.println(a);
		                    if(n == 0) {
		                    	System.out.println("yo " + a);
		                    	d[0] = a;
		                        d[1] = b;
		                        break;
		                    }
		                }
		                
		            }
		            if(temp != x && n != 0) {
		                while(b > y && b > 1) {
		                    b--;
		                    n--;
		                    System.out.println(a);
		                    if(n == 0) {
		                    	System.out.println("yo " + a);
		                    	d[0] = a;
		                    	d[1] = b;
		                    	break;
		                    }
		                }
		                
		            }
		        }
		        
		        System.out.println(d[0] * d[1]);
		    }
			
			 
			   
			}
		}
