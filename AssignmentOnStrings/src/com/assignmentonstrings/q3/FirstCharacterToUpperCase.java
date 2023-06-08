//Code by:Sharda Patil
package com.assignmentonstrings.q3;

import java.util.Scanner;

public class FirstCharacterToUpperCase {

	public static void main(String[] args) {
		// Write a program to convert the very first character of every word in uppercase into a String.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		for(int i=0; i<=str.length()-1;i++)
		{
			if(i==0)
			{
				ch[i] = Character.toUpperCase(ch[i]);
			}
			else if(ch[i] == ' ')
			{
				ch[i+1] = Character.toUpperCase(ch[i+1]);
			}			
		}
		
		System.out.println("\nAfter conversion : ");
		for(int i=0; i<=str.length()-1;i++)
		{
			System.out.print(ch[i]);			
		}
	}
}
