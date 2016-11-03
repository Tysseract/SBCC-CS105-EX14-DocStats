package unittest.cs105;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.DocStats;

public class DocStatsTester {
	private static final int maximumScore = 8;
	private static final int maximumAssignmentScore = 10;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() throws IOException {
		totalScore = 0;

		PrintWriter out = new PrintWriter("seuss.txt");
		out.println("One fish");
		out.println("Two fish");
		out.println("Red fish");
		out.println("Blue fish");
		out.close();		
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}
	
	public String readFile(String fileName) throws IOException {
		FileInputStream docFile = new FileInputStream(fileName);
		
		byte doc[] = new byte[docFile.available()];
		docFile.read(doc);
		
		docFile.close();
		
		return new String(doc);
	}

	@Test
	public void testGoblin() throws IOException {
		String testDocStr = readFile("goblin.txt");
		
		assertEquals(testDocStr, DocStats.readFile("goblin.txt"));
		assertEquals(1450, DocStats.getNumberCharacters(testDocStr));
		assertEquals(257, DocStats.getNumberWords(testDocStr));
		assertEquals(49, DocStats.getNumberLines(testDocStr));
			
		totalScore += 4;
	}

	@Test
	public void testSeuss() throws IOException {
		String testDocStr = readFile("seuss.txt");
		
		assertEquals(testDocStr, DocStats.readFile("seuss.txt"));
		assertEquals(37, DocStats.getNumberCharacters(testDocStr));
		assertEquals(8, DocStats.getNumberWords(testDocStr));
		assertEquals(4, DocStats.getNumberLines(testDocStr));
		
		totalScore += 4;
	}
}
