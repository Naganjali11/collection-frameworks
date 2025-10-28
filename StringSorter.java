package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringSorter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		//creates an array list to store array of strings input by the user
		ArrayList<String>strings=new ArrayList<>();
		while(true) {
			//read the next word(string) input by user
			String word=scanner.next();
			if(!word.matches("[a-zA-Z]+")) {
				//if the word dosen't match (its non-alphabetic break the loop)
				break;	
			}
			strings.add(word);
		}
		Collections.sort(strings);
		for(String word:strings) {
			System.out.print(word+" ");
		}
	}

}

