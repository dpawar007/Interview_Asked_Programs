package arrays;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoDigitsEqualTo6 {	
	
	   Set<String> s = new HashSet<>();
	 //List<String> s = new ArrayList<>();
	
	public void findPairsWithSum6(int[] arr) {		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 6) {
					System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
					s.add("("+arr[i]+","+arr[j]+")");    
				}
			}
		}
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {		 
	    int[] inputArray = { 1, 3, 2, 4, 2, 3, 3}; 	    
		SumOfTwoDigitsEqualTo6 digitsEqualTo6 = new SumOfTwoDigitsEqualTo6();
		digitsEqualTo6.findPairsWithSum6(inputArray);		 
	}	
	 	  
}
