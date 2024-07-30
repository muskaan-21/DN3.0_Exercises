package FinancialForcasting;

public class finance {
	//recursion  O(n)
	public static double predictfvalue(double currentvalue,double growthrate,int period) {
		if(period==0) {
			return currentvalue;
		}
	
	return predictfvalue(currentvalue*(1+ growthrate) , growthrate,period-1);
	
	}
	

	public static void main(String[] args) {
		double currentvalue=2000.0;
		double growthrate=0.05;
		int period=10;
		double futurevalue=predictfvalue(currentvalue,growthrate,period);
		System.out.println("the future value after "+period+" period is: "+futurevalue);
		
		

	}

}
