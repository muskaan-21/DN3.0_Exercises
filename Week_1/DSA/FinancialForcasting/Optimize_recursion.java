package FinancialForcasting;
import java.util.HashMap;
import java.util.Map;
public class Optimize_recursion {
	//using HashMap
	private static Map<Integer,Double> memo=new HashMap<>();
	public static double predictfvalue(double currentvalue,double growthrate,int period) {
		if(period==0) {
			return currentvalue;
		}
		if(memo.containsKey(period)) {
			return memo.get(period);
		}
		double futurevalue=predictfvalue(currentvalue*(1+growthrate),growthrate,period-1);
		memo.put(period,futurevalue);
		return futurevalue;
		
	}
	

	public static void main(String[] args) {
		double currentvalue=1000.0;
		double growthrate=0.05;
		int period=10;
		double futurevalue=predictfvalue(currentvalue,growthrate,period);
		System.out.println("the future value after " + period + " period is:" + futurevalue);
		
		

	}

}
