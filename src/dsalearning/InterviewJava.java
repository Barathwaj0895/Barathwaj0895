package dsalearning;

public class InterviewJava {
public static void main(String[] args) {
	String str = "Barathwaj Ravisankar";
	System.out.println("Original String: " + str);
	String[] str1 = str.split("\\s");
	String reversedString = "";
	
//		String str2= str1[1] + " " + str1[0];
//		System.out.println(str2);
	
	for(int i= 0; i<str1.length; i++) {
		if(i == str1.length -1)
			reversedString = str1[i] + reversedString;
		else
			reversedString = " " + str1[i] + reversedString;
	}
		System.out.println("Reversed string : " + reversedString);

}
}
