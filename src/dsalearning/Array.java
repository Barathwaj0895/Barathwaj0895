package dsalearning;

import java.util.Arrays;

import org.junit.Test;

public class Array {
	
	@Test
	public static void arrayIntro(String[] args){
		try {	
		int arr[]={50,60,70,80,90,100};
		for(int i=0;i<=arr.length;i++){
		System.out.println(arr[i]);
		}
	} catch (ArrayIndexOutOfBoundsException e) {
		e.getStackTrace();
		System.out.println("The index you have entered is invalid");
	}
   }
	
	@Test
	public static void arrarSort(String[] args) {
		try {
		int [] arraynum = {1,3,45,67,23,76,4,5,6,9,178};
		String[] stringarr = {"Barath","Sure","Motu","Abdul","Prabhu"};
		System.out.println("Unsorted Array is :" +Arrays.toString(arraynum));
		Arrays.sort(arraynum);
		System.out.println("Sorted Array is:" +Arrays.toString(arraynum));
		System.out.println("Unsorted String Array is: " +Arrays.toString(stringarr));
		Arrays.sort(stringarr);
		System.out.println("Sorted String Array is:" +Arrays.toString(stringarr));
		} catch (ArrayStoreException e) {
			e.getStackTrace();
		}
	}
	
	@Test
	public static void sumArrays(String[] args) {
		int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		for (int i : my_array)
		    sum += i;
		System.out.println("The sum is " + sum);
	}
	
	@Test
	public static void duplicateArray(String[] args){
		int[] arrnum = {1, 2, 5, 5, 6, 6, 7, 2};
		 
        for (int i = 0; i < arrnum.length-1; i++)
        {
            for (int j = i+1; j < arrnum.length; j++)
            {
                if ((arrnum[i] == arrnum[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+arrnum[j]);
                }
            }
        }
	}	
}
