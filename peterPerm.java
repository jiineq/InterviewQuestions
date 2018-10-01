import java.util.*;
//given an array of numbers, return all possible permutations and number of perms 
/*e.g. (1,2,3) should return:
 [(1,2,3)
  (1,3,2)
  (2,1,3)
  (2,3,1)
  (3,2,1)
  (3,1,2)]  =  6 permutations 
*/
class peterPerm {
	public static void main(String[] args) {
		int[] test1 = new int[] {1,2,3};
		int[] test2 = new int[] {1,2};
		int[] test3 = new int[] {4,10,-2,0,7};
		System.out.println(permIterate());
	}

	public static List<String> permIterate() {
		List<String> lis = new ArrayList<String>();
		int[] arr = {1,3};



		lis.add(Arrays.toString(arr));
		System.out.println(lis);
		return lis;
	}

	//public static List<String> permRecursive() {

	//}



}