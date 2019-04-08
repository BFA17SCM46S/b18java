package sumOfTwoNumsEqualsN;

import java.util.HashSet;

public class SumOfTwoNumsEqualsN {

	public static void findTwoNums(int[] numArr, int sum) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		/**
		 * add the array to hashSet
		 */
		for(int i=0; i<numArr.length;i++) {
			hashSet.add(numArr[i]);
		}
		
		/**
		 * if subtracted is in the hashSet, display it with the numArr[i]
		 */
		for(int i=0; i<numArr.length; i++) {
			int subtracted = sum-numArr[i];\\it is one substration
			
			if(hashSet.contains(subtracted)) {
				System.out.println("Two numbers: " + numArr[i] + ", " + subtracted);
			}
		}
	}

	public static void main(String[] args) {
		int[] numArr = { 1, 2, 3, 4, 5 };
		int summedValue = 5;
		findTwoNums(numArr, summedValue);
	}

}
