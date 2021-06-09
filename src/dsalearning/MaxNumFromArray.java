package dsalearning;

public class MaxNumFromArray {
	// max({4, 781, 8, 99, 103})   -> 781
	  // max({1, 2, 3, 4, 5})        -> 5
	  // max({3, 4})                 -> 4
	  // max({100})                  -> 100
	
	  public static void main (String[] args) {
		  int[] arrNum = {2349, 781, 8, 99, 103};
	    // assume first element of array is biggest number
	    int max = arrNum[0];
	
	    // loop over the array and test our above assumption
	    for(int i = 0; i < arrNum.length; i++) {
	      // if max was not the biggest number, update it
	      if(max < arrNum[i]) {
	        max = arrNum[i];
	      }
	    }
	
	    // after the loop max variable will hold the biggest number
	    System.out.println(max);                  
	  }
}

