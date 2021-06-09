package dsalearning;

public class StringReverse2 {
	public static void main(String[] args) {
		
		String str = "Barath is Passionate about SDET role";
		
		StringBuilder reverse = new StringBuilder();
		
		for(int i= str.length() -1; i>=0; i--) {
			
			reverse.append(String.valueOf(str.charAt(i)));
		}
		System.out.println(reverse.toString());
	}
}
