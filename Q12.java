/*
* DDD:DDD:DDD
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. 
 * The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?
 */
import java.util.*;

public class Q12 {

	public static void main(String[] args) {
		

		ArrayList<Integer> tnums = new ArrayList<Integer>();
		
		
		int temp = 0;
		for(int i = 1 ; i < 999999 ; i ++) {
			
			tnums.add(temp+i);
			temp = temp + i;
		}
		
		 for (Object tnum : tnums)
		    {    
			 if(divfinder((int)tnum) > 500) {
				 
				 System.out.println("Number = " + tnum + "  ->  Number of Divisors = " + divfinder((int) tnum));
				 break;
				 
			 }
			
		       //  System.out.println("Number = " + tnum + "  ->  Number of Divisors = " + divfinder((int) tnum));         
		    }
		 
		

	}
	
	public static int divfinder(int x) {
		ArrayList<Integer> divs = new ArrayList<Integer>();
		for(int i = 1 ; i <= x ; i++) {
			if(x % i == 0) {
				divs.add(i);				
			}
		}
		return divs.size();
	}
	
	

}
