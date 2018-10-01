/**
The dashes split the alphanumerical characters within the string into groups (i.e. if there are M dashes, the string is split into M+1 groups). The dashes in the given string are possibly misplaced.

We want each group of characters to be of length K (except for possibly the first group, which could be shorter, but still must contain at least one character). To satisfy this requirement, we will reinsert the dashes. Additionally, all the lower case letters in the string must be converted to upper case.

For example, in the license key "2-4A0r7-4k" there are two dashes which split it into three groups of lengths 1, 5 and 2, respectively. If we want each group to be of length 4, then we would have to reinsert the dashes. Thus, for K = 4, the correctly formatted string is "24A0-R74K".


given a non-empty string S consisting of N characters, representing a license key to format, and an integer K, returns the license key formatted according to the description above.

For example, given S = "2-4A0r7-4k" and K = 4, the function should return "24A0-R74K", and for K = 3, the function should return "24-A0R-74K" as the first group could be shorter. Given S = "r" and K = 1, the function should return "R".

Write an efficient algorithm for the following assumptions:

N and K are integers within the range [1..300,000];
string S consists only of alphanumerical characters (a−z and/or A−Z and/or 0−9) and/or dashes (-);
string S contains at least one alphanumerical character.

write an EFFICIENT ALGORITHM
**/
import java.util.*;

class googledemo1 {
  public static void main(String[] args) {
    String test = "2-4A0r7-4k";
    int n2 = 2;
    int n3 = 3; 
    int n4 = 4; 
    int n5 = 5;


    System.out.println(solution(test, n2)); //should out "24-A0-R7-4K"
    System.out.println(solution(test, n3));//should out "24A0-R74K"
    System.out.println(solution(test, n4));//should out "24-A0R-74K"
    System.out.println(solution(test, n5));//should out "24A-0R74K"

  }

  public static String solution(String S, int K) {
    String upper = S.toUpperCase();
    String str = upper.replace("-","");
    List<String> l = new ArrayList<String>();

    for (int i = str.length(); i >0; i-=K) {  //AB CD EF GH
      int currHead = i - K; 
      //System.out.println(i);
      if (currHead>0) l.add(str.substring(i-K, i));
      else l.add(str.substring(0, i));
    }
    Collections.reverse(l);
    return join("-",l); //in java 8 this is built in as stringjoiner obj so isn't super inefficient
    return joinsb("-",l); //alternatively create a sb helper method if not in java 8 bc strings concatenation sucks     
  }

  public static String joinsb(String delim, List<String> lis) {
    StringBuilder sb = new StringBuilder(); 
    String temp = "";

    for (String s : lis) {
      sb.append(temp).append(s);
      temp = delim;
    }
    return sb.toString();
  }

}