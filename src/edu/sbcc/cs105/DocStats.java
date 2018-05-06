/**
 * CS 105 Theory & Practice I
 * CRN: 62499
 * Assignment: DocStats
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Mattys C vanZeyl
 */

package edu.sbcc.cs105;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocStats {
	public static String readFile(String fileName) {
		
		String fileTxt = "";
		
		File importedFile = new File(fileName);
		Scanner fileIn = null;
		
		try {
			fileIn = new Scanner(importedFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(fileIn.hasNextLine()) {
			fileTxt = fileTxt + fileIn.nextLine();
			
			if(fileIn.hasNext()) {
				fileTxt = fileTxt + "\n";
			}
		}
		
		return fileTxt;
		
	}
	
	public static int getNumberCharacters(String fileTxt) {
		int characterCount = fileTxt.length();
		
		System.out.println("Number of characters: " + characterCount);
		return characterCount;
	}
		
	public static int getNumberWords(String fileTxt) {
		int wordCount = 0;
		
		if(!fileTxt.isEmpty()) {
			for(int i = 0; i < fileTxt.length(); i++) {
				if(fileTxt.charAt(i) == (' ') || fileTxt.charAt(i) == ('\n'))wordCount++;
			}
			
			wordCount++;
		}
		
		System.out.println("Number of words: " + wordCount);
		return wordCount;
	}
	
	public static int getNumberLines(String fileTxt) {
		int lineCount = 0;
		
		if(!fileTxt.isEmpty()) {
			for(int i = 0; i < fileTxt.length(); i++) {
				if(fileTxt.charAt(i) == ('\n'))lineCount++;
			}
			lineCount++;
		}
		
		System.out.println("Number of lines: " + lineCount);
		return lineCount;
	}
	
	public static void main(String args[]) {
		System.out.print("Enter file name: ");
		Scanner userIn = new Scanner(System.in);
		String fileName = userIn.next();
		userIn.close();
		
		String fileTxt = readFile(fileName);
		
		getNumberCharacters(fileTxt);
		getNumberWords(fileTxt);
		getNumberLines(fileTxt);
	}

}

/**
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocStats {
	public static String readFile(String fileName) {
		
		String fileTxt = "";
		
		File importedFile = new File(fileName);
		Scanner fileIn = null;
		
		try {
			fileIn = new Scanner(importedFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String nextChar = "";
		try{
			do {
				fileTxt = fileTxt + nextChar;
				//if(nextChar == "\n") fileTxt = fileTxt;
				//if(fileIn.findWithinHorizon(".",10000000)) fileTxt = fileTxt + "\n";
				nextChar = fileIn.findWithinHorizon(".",10000000);
			}while(!nextChar.equals(null));
		}catch(NullPointerException e) {
			
		}
		
		System.out.print(fileTxt);
		return fileTxt;
	
		
	}
	
	public static int getNumberCharacters(String fileTxt) {
		int characterCount = fileTxt.length();
		
		System.out.println("Number of characters: " + characterCount);
		return characterCount;
	}
		
	public static int getNumberWords(String fileTxt) {
		int wordCount = 0;
		
		if(!fileTxt.isEmpty()) {
			for(int i = 0; i < fileTxt.length(); i++) {
				if(fileTxt.charAt(i) == (' ') || fileTxt.charAt(i) == ('\n'))wordCount++;
			}
			
			wordCount++;
		}
		
		System.out.println("Number of words: " + wordCount);
		return wordCount;
	}
	
	public static int getNumberLines(String fileTxt) {
		int lineCount = 0;
		
		if(!fileTxt.isEmpty()) {
			for(int i = 0; i < fileTxt.length(); i++) {
				if(fileTxt.charAt(i) == ('\n'))lineCount++;
			}
			lineCount++;
		}
		
		System.out.println("Number of lines: " + lineCount);
		return lineCount;
	}
	
	public static void main(String args[]) {
		System.out.print("Enter file name: ");
		Scanner userIn = new Scanner(System.in);
		String fileName = userIn.next();
		userIn.close();
		
		String fileTxt = readFile(fileName);
		
		getNumberCharacters(fileTxt);
		getNumberWords(fileTxt);
		getNumberLines(fileTxt);
	}

}
*/