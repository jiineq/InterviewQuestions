import java.util.ArrayList;
import java.util.*;

//Capital One coding question 
//Convert usd to euros, and then return the minimum amount of bills & coins 
//Assume that 1usd:1.25 euro conversion rate 
//Euro bills = 5, 10, 20, 50, 100, 200, 500 
//Euro coins = 1c, 2c, 5c, 10c, 20c, 50c, 1, 2
//what is wrong with your dumb lizard brain that the only thing you thought during the interview was freaking if statements
class cap1q2 {
	public static void main(String[] args) {
		double usd1 = 1020.46; //816.368 euro
		double usd2 = 521.77; //417.416 euro
		double usd3 = 42.03; //33.624 euro
		double usd4 = 125.00; //100 euro

		int[] res1 = getBills(usd4);

		//god this is so long 
		System.out.println("500 bills: " + res1[0]+ " \n200 bills: " + res1[1]+" \n100 bills: " +res1[2]+"\n50 bills: " + res1[3]+" \n20 bills: " + res1[4]+" \n10 bills: " + res1[5]+" \n5 bills: " + res1[6]+" \n2e coins: " + res1[7]+"\n1e coins: " + res1[8]+" \n50c coins: " + res1[9]+" \n20c coins: " + res1[10]+" \n10c coins: " + res1[11]+" \n5c coins: " + res1[12]+" \n2c coins: " +res1[13]+ " \n1c coins: " + res1[14]);


	}
	public static double convert(double usd) {
		return usd/1.25;
	}

	public static int[] getBills(double americaMoney) {
		double[] bills = new double[]{500,200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01};
		int[] numbills = new int[15];
		double euro = convert(americaMoney);
		for (int i = 0; i < bills.length; i++) {
			while (euro >= bills[i]) {
				numbills[i] = (int)(euro/bills[i]);
				euro -= bills[i]*numbills[i];
			}
		}

    	return numbills;
	}

}