package dsalearning;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] arrNum = {5,4,3,2,1};
	    // we will use two 'pointers'. One pointer will start from the beginning
	    // another one from the back and we will swap their values
	
	    // pointer that will start from the back
	    int j = arrNum.length-1;
	
	    // our loop will go till half of our input array
	    // 'i' is a pointer that will start from the beginning
	    for(int i = 0; i < arrNum.length / 2; i++) {
	      // swap elements using positions of i and (j - i)
	      int tmp = arrNum[i];
	      arrNum[i] = arrNum[j - i];
	      arrNum[j - i] = tmp;
	      System.out.println(tmp);
	    }
	  }
}

