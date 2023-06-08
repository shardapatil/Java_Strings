//Code by:Sharda Patil
package com.assignmentonstrings.q1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Write a program to reverse the given String.

		Scanner sc = new Scanner(System.in); 
				
		System.out.println("Enter a string you want to reverse : ");
		String rev = sc.nextLine();
		
		char ch[] = rev.toCharArray();
		String reversed = "";
		for(int i=ch.length-1; i>=0;i--)
		{
			reversed = reversed +ch[i];
		}
		
		System.out.println("Reversed String is : "+reversed);
	}
}
