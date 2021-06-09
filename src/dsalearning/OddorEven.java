package dsalearning;

import java.util.Scanner;

public class OddorEven {
	
	public static void main(String []args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int myint = keyboard.nextInt();
		while(myint>=0)
		{
		myint = myint - 2;
		}
		if(myint == -1)
		{
		System.out.println("Integer is odd");
		}
		else
		{
		System.out.println("Integer is even");
		}

		}
		} 

