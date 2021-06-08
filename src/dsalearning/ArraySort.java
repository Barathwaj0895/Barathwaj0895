package dsalearning;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int [] arraynum = {1,3,45,67,23,76,4,5,6,9,178};
		String[] stringarr = {"Barath","Sure","Motu","Abdul","Prabhu"};
		
		System.out.println("Unsorted Array is :" +Arrays.toString(arraynum));
		Arrays.sort(arraynum);
		System.out.println("Sorted Array is:" +Arrays.toString(arraynum));
		
		System.out.println("Unsorted String Array is: " +Arrays.toString(stringarr));
		Arrays.sort(stringarr);
		System.out.println("Sorted String Array is:" +Arrays.toString(stringarr));
	}
}
