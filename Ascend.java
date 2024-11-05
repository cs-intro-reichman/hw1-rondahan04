
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		String sLim = args[0];
		int lim = Integer.parseInt(sLim);
		int a =(int)(Math.random() * (lim) + 1); // the one is added because if i wont add him the limit number wont appear ever.
		int b =(int)(Math.random() * (lim) + 1); // and the int before the Mathrandom function is because Mathrandom returns a double and I want and Integer.
		int c =(int)(Math.random() * (lim) + 1); 
		int min = Math.min(Math.min(a , b),c);
		int max = Math.max(Math.max(a,b),c);
		int mid = a+b+c-min-max;
		System.out.println (min + " "+ mid + " " + max);
	}
}
