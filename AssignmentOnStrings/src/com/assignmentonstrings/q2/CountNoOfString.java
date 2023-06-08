//Code by:Sharda Patil
package com.assignmentonstrings.q2;

import java.util.Scanner;

public class CountNoOfString {

	public static void main(String[] args) {
		// Write a program to count no of words in the String.
		
		int word_count =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		for(int i=0; i<=str.length()-1 ; i++)
		{
			//checking for space in string
			if(ch[i] == ' ')
			{
				word_count = word_count + 1;
			}
		}
		
		//to count the last word of string
		word_count = word_count + 1;
		
		System.out.println("No of words present are : "+word_count);		
	}
}
