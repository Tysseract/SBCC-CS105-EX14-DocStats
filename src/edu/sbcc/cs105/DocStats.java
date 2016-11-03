package edu.sbcc.cs105;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DocStats {
	public static String readFile(String filename) throws IOException {
		FileInputStream docFile = new FileInputStream(filename);
		
		byte doc[] = new byte[docFile.available()];
		docFile.read(doc);
		
		docFile.close();
		
		return new String(doc);		
	}
	
	public static int getNumberCharacters(String docStr) {
		return docStr.length();
	}
	
	public static int getNumberWords(String docStr) {
		return docStr.split("\\s+").length;
	}
	
	public static int getNumberLines(String docStr) {
		return docStr.split("\\n\\r|\\n|\\r|\\r\\n").length;
	}
	
	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter filename: ");
		String fileName = in.next();
		in.close();
		
		String docStr = readFile(fileName);
		
		System.out.println("Number of characters: " + getNumberCharacters(docStr));
		System.out.println("Number of words: " + getNumberWords(docStr));
		System.out.println("Number of lines: " + getNumberLines(docStr));
		
	}
}