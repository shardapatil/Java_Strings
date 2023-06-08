//Code by:Sharda Patil
package com.assignmentonstrings.q4;

import java.util.Scanner;

public class ReverseEveryWord {

	public static void main(String[] args) {
		//Write a program to reverse every word of the String.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		String words[] = str.split(" ");
		String revWord = "";
		
		for(String w:words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			revWord = revWord + sb.toString() + ' ';
		}
		
		System.out.println(revWord.trim());
	}
}
