package arrays;

import java.util.Scanner;

public class MaxSumSubarray {

	public static void main(String[] args) {
		// import and create a Scanner class
		Scanner sc = new Scanner(System.in);
		
		// take an integer input n that defines the size of an array
		int n = sc.nextInt();
		
		// create an array with size n
		int[] array = new int[n];
		
		// Take elements entered by the user and store it in array
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		// finding sub array with max sum in an array
		// kadane's algorithm:
		int maxSum = array[0];
		int curSum = array[0];
		int start = 0, end = 0, tempStart = 0;
		
		for(int i = 1; i < n; i++) {
			if(curSum < 0) {
				curSum = array[i];
				tempStart = i;
			}else {
				curSum = curSum + array[i];
			}
			if(curSum > maxSum) {
				maxSum = curSum;
				start = tempStart;
				end = i;
			}
		}
		// printing maximum sum in a subarray
		System.out.println("Maximum Sum is: " + maxSum);
		
		// printing the subarray which has maxSum
		for(int i = start; i <= end; i++) {
			System.out.print(array[i] + " ");
		}
		
		sc.close();

	}

}
// 3, -2, 5, -1, 4, -5, 7