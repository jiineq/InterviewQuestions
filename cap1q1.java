//gets the date and returns it in the fomrat January 1st 
//no year 
//all dates are strings 
//assumes strings are 01-01-2018 format 
//input 01-01-2018 -> output "January 1st"

import java.util.*;

class cap1q1 {
	public static void main(String[] args) {
		String test1 = "01-01-2018";
		String test2 = "02-02-2014";
		String test3 = "05-03-2011";
		String test4 = "07-21-2015";
		String test5 = "07-20-1999";
		String test6 = "12-22-2131";
		String test7 = "04-11-2121";
		String test8 = "04-12-2121";

		System.out.println(foo(test1));
		System.out.println(foo(test2));
		System.out.println(foo(test3));
		System.out.println(foo(test4));
		System.out.println(foo(test5));
		System.out.println(foo(test6));
		System.out.println(foo(test7));
		System.out.println(foo(test8));

	}

	public static String foo(String inp) {
		//jesus christ is there a faster way to do this -__-
		Map<String, String> map = new HashMap<String, String>();
		map.put("01", "January");
		map.put("02", "February");
		map.put("03", "March");
		map.put("04", "April");
		map.put("05", "May");
		map.put("06", "June");
		map.put("07", "July");
		map.put("08", "August");
		map.put("09", "September");
		map.put("10", "October");
		map.put("11", "November");
		map.put("12", "December");

		String s = "";
		String[] arr = inp.split("-");
		if (map.containsKey(arr[0])) {
			s = s + map.get(arr[0]);
		}
		int n = Integer.parseInt(arr[1]);
		int p = n%10; //gets rightmost digit 
		//why is english such a dumb inconsistent language are you serious -_- 11st, 12nd ugh
		if (Integer.parseInt(arr[1])/10 == 1) return s + " " + n + "th"; 

		//normal cases 
		if (p == 1) { 
			s +=(" " + n + "st");
		}
		else if (p == 2) {
			s+=(" " + n + "nd");
		}
		else if (p == 3) {
			s+=(" " + n + "rd");
		}
		else {
			s+=(" " + n + "th");
		}
		return s;

	}


}