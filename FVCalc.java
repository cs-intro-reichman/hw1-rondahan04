// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int value = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]); // the input rate for example 20%
		int years = Integer.parseInt(args[2]);
		double rateC = rate/100+1; // making the rate 1.2
		double futureValue = Math.pow(rateC, years) * value;
		System.out.println ("After " + years + " years,$" +  value  + " saved at " +rate + "% will yield $" + (int)futureValue);
	}
}