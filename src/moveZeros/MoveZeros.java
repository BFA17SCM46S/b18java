package moveZeros;

import java.util.Arrays;


/**
 * Dry run
 * [0, 2, 0, 1, 0, 2, 1, 2, 1, 0] 
 * [2, 0, 0, 1, 0, 2, 1, 2, 1, 0] 
 * [2, 1, 0, 0, 0, 2, 1, 2, 1, 0] 
 * [2, 1, 2, 0, 0, 0, 1, 2, 1, 0] 
 * [2, 1, 2, 1, 0, 0, 0, 2, 1, 0]
 * [2, 1, 2, 1, 2, 0, 0, 0, 1, 0] 
 * [2, 1, 2, 1, 2, 1, 0, 0, 0, 0]
 */

public class MoveZeros {

	public static void moveZeros(int[] numArr) {
		int i = 0;
		int j = -1;
		while (i < numArr.length) {

			/**
			 * find the first '0' then j will not longer be -1
			 */
			if (numArr[i] == 0 && j == -1) {
				System.out.println(Arrays.toString(numArr));
				j = i;
			}
			/**
			 * j is the position of the '0' numArr[i] is a non-zero and will replace the
			 * value at the previous '0' position
			 */
			else if (numArr[i] != 0 && j != -1) {
				numArr[j] = numArr[i];
				numArr[i] = 0;
				j++;
				System.out.println(Arrays.toString(numArr));
			}
			i++;
		}
	}

	public static void main(String[] args) {
		int[] numArr = { 0, 2, 0, 1, 0, 2, 1, 2, 1, 0 };
		moveZeros(numArr);
	}
}
