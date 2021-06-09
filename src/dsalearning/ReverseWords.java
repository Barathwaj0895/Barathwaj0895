package dsalearning;

public class ReverseWords {
	public static void main(String[] args) {
		String str = "Motu Sure Barath Prabhu Abdul";
	    StringBuilder reversedWords = new StringBuilder();
	
	    // split input string by " " space to get each word as String[]
	    String[] words = str.split(" ");
	
	    // loop over the array from back
	    for(int i = words.length - 1; i >= 0; i--) {
	      // add words to reversedWords with space
	      reversedWords.append(words[i] + " ");
	    }
	
	    // trim needed to remove last space in the end
	    System.out.println(reversedWords.toString().trim());
	  }
}

