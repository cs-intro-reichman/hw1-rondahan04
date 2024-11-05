// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int bill = Integer.parseInt(args[3]);
		double finalbill = Math.ceil((double) bill/3); // finalbill must be double because math ceil returns double, and /3 splits among 3 persons.
		System.out.println ("Dear " + name3 + ", " + name2 + ", and " +name1 + ": " + "pay " + finalbill + " Shekels" +" each.");
	}
}
