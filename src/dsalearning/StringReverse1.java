package dsalearning;

import java.util.Scanner;

public class StringReverse1 {
//	public static void main(String[] args) {
////		String str = "SDET an as work to want I and Barath I'm";
//		String str = "m'I htaraB dna I tnaw ot krow sa na TEDS";
//		StringBuilder reverse = new StringBuilder();
//		for (int i=str.length() -1; i>=0;i--) {
//			reverse.append(String.valueOf(str.charAt(i)));
//		}
//		System.out.println(reverse.toString());
//	}
	
	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Original string : ");
// 
//        String originalStr = scanner.nextLine();
//        scanner.close();
		
		String originalStr = "I'm Barath";
		System.out.println("Original String: " + originalStr);
        String words[] = originalStr.split("\\s");
        String reversedString = "";
        //Reverse each word's position
        for (int i = 0; i < words.length; i++) { 
            if (i == words.length - 1) {
                reversedString = words[i] + reversedString; 
            }
            else {
                reversedString = " " + words[i] + reversedString; 
            }
        } 
        // Displaying the string after reverse
        System.out.println("Reversed string : " + reversedString);
    }
}


