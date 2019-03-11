//given an int array A of random integers and target integer B 
//return true if there exists a subarray of A such that the sum of the elements equal B 
//e.g. A = [5, 9, -3, 1] B = -2
//return true b/c -3 +1 = -2 
import java.util.HashSet; 

class fb1 {

	public static void main(String[] args) {
		int[] arr = new int[]{5,9,-3,1};
		int target = -2;
		int[] arr2 = new int[] {10,2,-5,7,10};
		int target2 = 17;
		int target3 = 30;
		System.out.println(subarrayExistsON(arr,target)); //return true 
		System.out.println(subarrayExistsON(arr2,target2)); //return true
		System.out.println(subarrayExistsON(arr,target3)); //return false
		System.out.println(subarrayExistsON(arr2,target3));  //return false 

	}

	//O(n) sol
	//only iterates thru array A once 
	//cumulatively adds sum of array and checks if (sum-target) is equal to 0, because if then that means the sum is equal to the target. thus there exists a subarray 
	//otherwise throws past sums into a bucket
	//this works because the sum of a subarray would be equal to all of the current elements summed - target
	//e.g. given A = [10,2,-5,7,10] B = 17
	//sum of elements/elements in bucket --> [10,12,7,14,24]
	//24-17 = 7. 7 is in bucket so there exists a subarray (between index of where 7 is in bucket--> 2 and index of 24 in bucket-->4) 
	public static boolean subarrayExistsON(int[] A, int B) {
		HashSet<Integer> s = new HashSet<Integer>();
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			if (sum-B == 0) 
				return true;
			if (s.contains(sum-B)) 
				return true;
			s.add(sum); 
		}
		return false;
	}

	//O(n^2) sol
	//takes input string and sums up each index with the previous sum 
	//finds the difference between each sum 
	//if a difference equals target then subarray exists 
	//e.g.  A= [5, 9, -3, 1] target = -2 
	//		[5,9,-3,1] --> [5,14,11,12] --> 12-5 = 7, 12-14 = -2 subarray exists btwn index 1 and 3 (not inclusive of 1)
	//to save space, we don't need to create a new array and can just sum up in the argument tho 
	public static boolean subarrayExistsNSQUARED(int[] A, int B) { 
		int[] arrSum = new int[A.length]; //sum of indices of input array 
		arrSum[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			arrSum[i] = arrSum[i-1] + A[i];
		}
		for (int i = arrSum.length-1; i >= 0; i--) { 
			for (int j = 0; j < arrSum.length; j++) { 
				if (arrSum[i]-arrSum[j] == B) return true; 
			}
		}
		return false;
	}
}
