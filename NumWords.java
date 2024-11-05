// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int iNum= Integer.parseInt(args[0]);
		int hundreds = iNum/100;
		iNum= iNum - 100 * hundreds;
		int tens = iNum/10;
		iNum= iNum - tens * 10;
		System.out.println (hundreds + " hunderds, " + tens + " tens, " + "and " +  iNum + " ones.");
	}
}
