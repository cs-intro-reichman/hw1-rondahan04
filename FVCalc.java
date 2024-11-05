// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		String currentValue = args[0];
		String annualInterestRate = args[1];
		String n = args[2];
		int value = Integer.parseInt(currentValue);
		double rate = Double.parseDouble(annualInterestRate);
		double rateC = rate/100+1;
		double years = Double.parseDouble(n);
		double futureValue = Math.pow(rateC, years) * value;
		System.out.println ("After " + n + " years, " + "$" +  currentValue  + "saved at " +rate + "%" + "will yield " + "$" + (int)futureValue);
	}
}