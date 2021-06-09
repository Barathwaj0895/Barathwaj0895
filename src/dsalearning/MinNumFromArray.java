package dsalearning;

public class MinNumFromArray {
	// min({4, 781, 8, 99, 103})  -> 4
	  // min({1, 2, 3, 4, 5})       -> 1
	  // min({3, 4})                -> 3
	  // min({100})                 -> 100
	
	  public static void main(String[] args) {
		  int[] arrNum = {7, 2, 3, 4, 5};
	    // assume first element of array is the smallest number
	    int min = arrNum[0];
	
	    // loop over the array and test assumption
	    for(int i = 0; i < arrNum.length; i++) {
	      // if min was not smallest, update it
	      if(min > arrNum[i]) {
	        min = arrNum[i];
	      }
	    }
	
	    System.out.println(min);
	  }
	
}

